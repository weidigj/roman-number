package test;

import io.notech.romanconverter.Converter;
import io.notech.romanconverter.EInvalidRomanSymbol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    private Converter converter;

    @BeforeEach
    void initConverter(){
        converter = new Converter();
    }

    @Test
    void convert() {
        try {
            Assertions.assertEquals(converter.convert(""), 0);

            Assertions.assertEquals(converter.convert("I"), 1);
            Assertions.assertEquals(converter.convert("V"), 5);
            Assertions.assertEquals(converter.convert("X"), 10);
            Assertions.assertEquals(converter.convert("L"), 50);
            Assertions.assertEquals(converter.convert("C"), 100);
            Assertions.assertEquals(converter.convert("D"), 500);
            Assertions.assertEquals(converter.convert("M"), 1000);
        } catch (EInvalidRomanSymbol e){
            fail("unexpected exception "+e);
        }
    }

    @Test
    void convertMulti2() {
        try{
            Assertions.assertEquals(converter.convert("IV"),4);
            Assertions.assertEquals(converter.convert("IX"),9);
        } catch (EInvalidRomanSymbol e){
            e.printStackTrace();
            fail("unexpected exception "+e);
        }
    }
    @Test
    void convertMulti2x2() {
        try{
            Assertions.assertEquals(converter.convert("XC"),90);
            Assertions.assertEquals(converter.convert("XL"),40);
        } catch (EInvalidRomanSymbol e){
            e.printStackTrace();
            fail("unexpected exception "+e);
        }
    }
    @Test
    void convertMulti2x3() {
        try{
            Assertions.assertEquals(converter.convert("CD"),400);
            Assertions.assertEquals(converter.convert("CM"),900);
        } catch (EInvalidRomanSymbol e){
            e.printStackTrace();
            fail("unexpected exception "+e);
        }
    }
    @Test
    void convertMulti2x4() {
        try{
            Assertions.assertEquals(converter.convert("VI"),6);
            Assertions.assertEquals(converter.convert("XI"),11);
            Assertions.assertEquals(converter.convert("LX"),60);
            Assertions.assertEquals(converter.convert("CX"),110);
            Assertions.assertEquals(converter.convert("DC"),600);
            Assertions.assertEquals(converter.convert("MC"),1100);
        } catch (EInvalidRomanSymbol e){
            e.printStackTrace();
            fail("unexpected exception "+e);
        }
    }

    @Test
    void convertMultiLong() {
        try{
            Assertions.assertEquals(converter.convert("MMM"),3000);
        } catch (EInvalidRomanSymbol e){
            e.printStackTrace();
            fail("unexpected exception "+e);
        }
    }
    @Test
    void convertMultiLong2() {
        try{
            Assertions.assertEquals(converter.convert("MDCLXVI"),1666);
        } catch (EInvalidRomanSymbol e){
            e.printStackTrace();
            fail("unexpected exception "+e);
        }
    }
    @Test
    void convertMultiLong3() {
        try{
            Assertions.assertEquals(converter.convert("MCDXLIX"),1449);
        } catch (EInvalidRomanSymbol e){
            e.printStackTrace();
            fail("unexpected exception "+e);
        }
    }

    @Test
    void convertMultiLong4() {
        try{
            Assertions.assertEquals(converter.convert("CCCXC"),390);
        } catch (EInvalidRomanSymbol e){
            e.printStackTrace();
            fail("unexpected exception "+e);
        }
    }

    @Test
    void invalidConvert() {
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("Z"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("VV"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("DD"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("LL"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("IIII"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("IVI"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("ID"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("IL"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("XXXX"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("IVI"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("ID"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("IL"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("XIIV"));
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("IVX"));
    }


    @Test
    void noise(){
        assertThrows(EInvalidRomanSymbol.class, () -> converter.convert("dhjk"));


    }
}