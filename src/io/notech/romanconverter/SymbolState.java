package io.notech.romanconverter;

public interface SymbolState {
    SymbolState transition(char c) throws EInvalidRomanSymbol;

    int value();

    int evaluate();
}
