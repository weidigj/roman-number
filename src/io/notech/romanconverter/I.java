package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class I extends MultiOccurrencesSymbol{
    /**
     * I -> I{3} IX IV
     */
    public I(ArrayList<SymbolState> l) {
        super(l,1, Collections.emptyList(), Arrays.asList('X', 'V'));
    }
}
