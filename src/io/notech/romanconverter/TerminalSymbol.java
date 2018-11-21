package io.notech.romanconverter;

import java.util.ArrayList;
import java.util.Collections;

class TerminalSymbol extends SingleOccurrenceSymbol {
    TerminalSymbol(ArrayList<SymbolState> l, int value) {
        super(l,value, Collections.emptyList());
    }
}
