package io.notech.romanconverter;


import java.util.ArrayList;

public class IV extends TerminalSymbol implements SymbolState{
    /**
     * IV -x->
     */
    public IV(ArrayList<SymbolState> l) {
        super(l, 4);
    }
}
