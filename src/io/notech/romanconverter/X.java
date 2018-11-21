package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Arrays;

public class X extends MultiOccurrencesSymbol{
    /**
     * X -> X{3} XL XC
     *   -> V I
     */
    public X(ArrayList<SymbolState> l) {
        super(l, 10, Arrays.asList('V', 'I'), Arrays.asList('L', 'C'));
    }

}
