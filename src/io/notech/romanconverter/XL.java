package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Arrays;

public class XL extends SingleOccurrenceSymbol{
    /**
     * XL -> V I
     */
    public XL(ArrayList<SymbolState> l) {
        super(l, 40, Arrays.asList( 'V', 'I'));
    }
}
