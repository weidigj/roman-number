package io.notech.romanconverter;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

abstract class SingleOccurrenceSymbol extends AbstractSymbol{
    private final int value;
    private final List<Character>  transitions;

    SingleOccurrenceSymbol(ArrayList<SymbolState> l, int value, List<Character> transitions) {
        super(l);
        this.value=value;
        this.transitions = transitions;
    }

    public SymbolState transition(char c) throws EInvalidRomanSymbol {
       if (transitions.contains(c)){
            try {
                Constructor constructor = Class.forName("io.notech.romanconverter."+c).getConstructor(ArrayList.class);
                return (AbstractSymbol) constructor.newInstance(l);
            } catch (Exception e){
                throw new EInvalidRomanSymbol("Invalid transition from "+this.getClass().getSimpleName()+" to io.notech.romanconverter."+c);
            }
        } else {
            throw new EInvalidRomanSymbol();
        }
    }

    @Override
    public final int value() {
        return value;
    }
}
