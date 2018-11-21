package io.notech.romanconverter;


import java.util.ArrayList;

public class IX extends TerminalSymbol implements SymbolState{
    /**
     * IX -x->
     */
    public IX(ArrayList<SymbolState> l) {
        super(l, 9);
    }
}
