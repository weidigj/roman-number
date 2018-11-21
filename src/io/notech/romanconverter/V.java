package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Collections;

public class V extends SingleOccurrenceSymbol{
    /**
     * V -> I
     */
    public V(ArrayList<SymbolState> l) {
        super(l,5, Collections.singletonList('I'));
    }
}
