package io.notech.romanconverter;

import io.notech.romanconverter.EInvalidRomanSymbol;


public class Converter{
    public int convert(String romanNumber)throws EInvalidRomanSymbol{
        SymbolState state = new RootSymbol();
        for (char c : romanNumber.toCharArray()) {
            state = state.transition(Character.toUpperCase(c));
        }

        return state.evaluate();
    }
}
