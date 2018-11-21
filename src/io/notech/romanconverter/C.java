package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Arrays;

class C extends MultiOccurrencesSymbol{
    /**
     * C -> C{3} CM CD
     *   -> L V I X
     */
    C(ArrayList<SymbolState> l){
        super(l, 100, Arrays.asList('L', 'V', 'I', 'X'), Arrays.asList('M', 'D'));
    }
}
