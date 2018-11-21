package io.notech.romanconverter;

import java.util.ArrayList;

abstract class AbstractSymbol implements SymbolState{
    protected final ArrayList<SymbolState> l;

    AbstractSymbol(ArrayList<SymbolState> l){
        this.l=l;
        l.add(this);
    }

    @Override
    public int evaluate() {
        return l.stream()
                .mapToInt(SymbolState::value)
                .sum();
    }
}
