package day21_30.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        /*
        remove() methodu iki sekilde kullanilir
        1- Objeyi yazip silmesini istersek bize boolean sonuc doner
        2- Index girersek o indexteki elemani siler ve bize silinen elemani dondurur(String)
         */

        System.out.println(urunler);// [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram")); // true
        System.out.println(urunler);// [Nutella, Cekirdek, Cay]

        System.out.println(urunler.remove("Hobby")); // false
        System.out.println(urunler);// [Nutella, Ikram, Cekirdek]

        // index girerek deneyelim
        System.out.println(urunler.remove(1));
        System.out.println(urunler);

        //olmayan bir urunu silmeye calisirsak  run time error aliriz
        //System.out.println(urunler.remove(3));


    }
}
