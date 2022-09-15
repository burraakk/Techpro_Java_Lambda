package day01_10.day03_scanner;

public class C01_AsciiTablo {
    public static void main(String[] args) {
        //1-  bir integer ve bir char variable olustur ve toplamlarini yazdir

        int sayi = 10;
        char harf = 'a';  // a harfinin Ascii tablosundaki degeri 97
        String str = "banan";

        System.out.println(sayi+harf); //char matematiksel isleme girince Ascii tabledaki degerini alir
        System.out.println(sayi*harf);
        System.out.println(str+harf);
        System.out.println(harf+2);
        System.out.println(str + sayi + harf);
        System.out.println(sayi+harf+str);

        //2-   10a ciktisi almak istiyorsak
        System.out.println("" + sayi + harf);

        //3-  rakamların da kendilerinden farkli Ascii degerleri vardir
        char deger = '1';    //1 rakamı Ascii tableda 49 degerindedir
        System.out.println(harf + deger);

        /* 4-
        CHAR'I SU SEKILDE KULLANARAK VARIABLE ATAYAMAYIZ !!!
        char yeniHarf = harf+3;
        System.out.println(yeniHarf);
        */

    }
}
