package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Arrays;

public class L extends SingleOccurrenceSymbol {
    /**
     * L -> X V I
     */
    public L(ArrayList<SymbolState> l) {
        super(l, 50, Arrays.asList('X', 'V', 'I'));
    }
}
