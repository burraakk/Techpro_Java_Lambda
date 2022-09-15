package day11_20.day14_methodCreation;

import day11_20.day13_methodCreation.C04_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        /*
        Input olarak verilen isim ve soyismi
        ilk harfi buyuk geriye kalan harfler * olacak sekilde
        I***** K***** seklinde yazdiran method olusturun
         */

        String isim = "Enes";
        String soyisim = "Bozkurt";

        ismiGizle(isim, soyisim);//E*** B****** ...ancak isim ve soyisim degerleri halen degismedi
        System.out.println(isim+" "+ soyisim);//yazdirinca Enes Bozkurt yazar...Void metot kullanırsak degerler degismez
        C04_MethodCreation.topla(8,7);
        C02_MethodCreation.rakamlariTopla(329);
    }
    public static void ismiGizle(String isim, String soyisim) {

        isim = isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\w","*");
        soyisim = soyisim.substring(0,1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+soyisim);


    }
}
