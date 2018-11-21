package io.notech.romanconverter;


import java.util.ArrayList;
import java.util.Arrays;

public class CM extends SingleOccurrenceSymbol{
    /**
     * CM -> D L V I X
     */
    public CM(ArrayList<SymbolState> l) {
        super(l,900, Arrays.asList( 'D', 'L', 'X', 'V', 'I'));
    }


}
