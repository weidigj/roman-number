package io.notech.romanconverter;

public class EInvalidRomanSymbol extends Throwable {
    EInvalidRomanSymbol(String msg){
        super(msg);
    }

    EInvalidRomanSymbol(){
        super();
    }


}
