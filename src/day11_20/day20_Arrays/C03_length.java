package day11_20.day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {
        //iki sekilde array olusturabiliriz

        int sayilar[] = {1,2,3};
        String harfler[] = new String[4];

        //String length() methodunda parantez var, array length'de yok
        System.out.println("sayilar array'inin uzunlugu : "+sayilar.length);
        System.out.println("harfler array'inin uzunlugu : "+harfler.length);

        System.out.println(Arrays.toString(harfler));

        //array'in son elementini yazdirin
        System.out.println(harfler[harfler.length - 1]);
        System.out.println(sayilar[sayilar.length - 1]);

        //index disi eleman yazdirmak istersek run time error verir (ArrayIndexOutOfBoundsException)
        System.out.println(harfler[5]);


    }
}
