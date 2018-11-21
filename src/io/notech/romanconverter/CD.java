package io.notech.romanconverter;


import java.util.ArrayList;
import java.util.Arrays;

public class CD extends SingleOccurrenceSymbol implements SymbolState{
    /**
     * C -> L X V I
     */
    public CD(ArrayList<SymbolState> l){
        super(l,400, Arrays.asList( 'L', 'X', 'V', 'I'));
    }
}
