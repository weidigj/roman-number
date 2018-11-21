package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Arrays;

public class D extends SingleOccurrenceSymbol{
    /**
     * D -> C L X V I
     */
    public D(ArrayList<SymbolState> l) {
        super(l, 500, Arrays.asList( 'C', 'L', 'X', 'V', 'I'));
    }
}
