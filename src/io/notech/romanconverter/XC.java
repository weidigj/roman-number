package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Arrays;

public class XC extends SingleOccurrenceSymbol{
    /**
     * XC -> V I
     */
    public XC(ArrayList<SymbolState> l) {
        super(l,90, Arrays.asList( 'V', 'I'));
    }

}
