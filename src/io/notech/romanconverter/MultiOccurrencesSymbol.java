package io.notech.romanconverter;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

abstract class MultiOccurrencesSymbol extends AbstractSymbol {
    private final int value;
    private final List<Character> transitions;
    private final List<Character> mutations;

    MultiOccurrencesSymbol(ArrayList<SymbolState> l, int value,
                           List<Character> transitions, List<Character> mutations) {
        super(l);
        this.value = value;
        this.occurrences = 1;
        this.transitions = transitions;
        this.mutations = mutations;
    }

    private int getOccurrence() {
        return occurrences;
    }

    private void inc() throws EInvalidRomanSymbol {
        if (occurrences >= 3) {
            throw new EInvalidRomanSymbol();
        } else {
            this.occurrences++;
        }
    }

    public SymbolState transition(char c) throws EInvalidRomanSymbol {
        if (getOccurrence() > 1 && mutations.contains(c)) {
            throw new EInvalidRomanSymbol();
        } else if (c == this.getClass().getSimpleName().charAt(0)) {
            inc();
            return this;
        } else {
            if (transitions.contains(c)) {
                try {
                    return getAbstractSymbolByName("io.notech.romanconverter." + c);
                } catch (Exception e) {
                    throw new EInvalidRomanSymbol("Invalid transition from " + this.getClass().getSimpleName() + " to io.notech.romanconverter." + c);
                }
            } else if (mutations.contains(c)) {
                try {
                    clearSymbol();
                    return getAbstractSymbolByName("io.notech.romanconverter." + this.getClass().getSimpleName() + c);
                } catch (Exception e) {
                    throw new EInvalidRomanSymbol("Invalid mutation: io.notech.romanconverter." + this.getClass().getSimpleName() + c);
                }
            } else {
                throw new EInvalidRomanSymbol();
            }
        }
    }

    private AbstractSymbol getAbstractSymbolByName(String name) throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Constructor constructor = Class.forName(name).getConstructor(ArrayList.class);
        return (AbstractSymbol) constructor.newInstance(l);
    }

    private void clearSymbol() {
        this.occurrences = 0;
    }

    private int occurrences;

    @Override
    public final int value() {
        return occurrences * value;
    }
}
