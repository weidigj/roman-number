package main;

import io.notech.romanconverter.Converter;
import io.notech.romanconverter.EInvalidRomanSymbol;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Input an roman number: ");
            String n = input.nextLine();
            try {
                Converter converter = new Converter();
                int conversion = converter.convert(n);
                System.out.println(String.format("> "+ANSI_GREEN+"%s"+ANSI_RESET +" is converted in "+ANSI_PURPLE+"%d"+ANSI_RESET, n, conversion));

            } catch (EInvalidRomanSymbol eInvalidRomanSymbol) {
                System.out.println(String.format("> "+ANSI_RED+"%s"+ANSI_RESET+" is not a roman number!!!", n));
            }
            System.out.println();
        }
    }
}
