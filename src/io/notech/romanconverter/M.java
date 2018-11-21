
package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class M extends MultiOccurrencesSymbol{
    /**
     * M -> M
     *   -> C D L X V I
     */
    public M(ArrayList<SymbolState> l) {
        super(l, 1000, Arrays.asList('C', 'D', 'L', 'X', 'V', 'I'), Collections.emptyList());
    }
}
