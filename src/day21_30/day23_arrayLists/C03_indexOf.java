package day21_30.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler);// [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.indexOf("Ikram"));// 1
        System.out.println(urunler);// [Nutella, Ikram, Cekirdek, Cay]

        /*
        indexOf() methodu bize bilgi donduren bir methoddur
        listemizi degistirmez
         */

        System.out.println(urunler.lastIndexOf("Ikram"));// 1
        /*
        indexOf() methodu urunu aramaya 0. index'ten
        lastIndexOf() methodu ise aramaya son indexten baslar
        arama bitip urun bulundugunda ikisi de bulunan urunun indexini verir
         */

        urunler.add("Ikram");
        System.out.println(urunler);// [Nutella, Ikram, Cekirdek, Cay, Ikram]
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler.lastIndexOf("Ikram"));//4

        System.out.println(urunler.indexOf("Hobby"));// -1
        System.out.println(urunler.lastIndexOf("Hobby"));// -1

    }
}
