package day01_10.day10_stringManipulations;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Beni psikopata baglamayin";

        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));//BU CALISMADI BENDE!!!!!!!!!


    }
}
