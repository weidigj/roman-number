package io.notech.romanconverter;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

class RootSymbol extends AbstractSymbol{
    RootSymbol() {
        super(new ArrayList<>());
    }

    @Override
    public SymbolState transition(char c) throws EInvalidRomanSymbol {
        try {
            Constructor constructor = Class.forName("io.notech.romanconverter."+c).getConstructor(ArrayList.class);
            return (AbstractSymbol) constructor.newInstance(l);
        } catch (Exception e){
            throw new EInvalidRomanSymbol("Invalid transition from "+this.getClass().getSimpleName()+" to io.notech.romanconverter."+c);
        }
    }

    @Override
    public int value() {
        return 0;
    }
}
