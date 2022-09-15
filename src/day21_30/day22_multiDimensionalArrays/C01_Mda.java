package day21_30.day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
        tek katli array'lerde array'i direkt yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data direkt yazdirilamayabilir

        ancak aaryin icerisindeki elementleri direkt yazdirabiliyorduk
        cunku genelde primitive data tru veya String elementler kullaniliyordu

        Multi-dimensional arraylerde en dikkat edecegiimiz konu
        ulasmak istedigimiz elementin bir array mi
        yoksa primitive data mi oldugudur
         */

        int[][] sayilar = {{1,2,4,5},{3,4}};
        /*
        burada sayilar arrayi'ini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]
         */
        System.out.println(sayilar[0]); //[I@b4c966a  referansini yazdirir
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]

        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3

        System.out.println(Arrays.toString(sayilar));//[[I@b4c966a, [I@2f4d3709]
        System.out.println(Arrays.deepToString(sayilar));// [[1, 2, 4, 5], [3, 4]]

        /*
        arrayi iki sekilde deklare edebiliyorduk
        1- Elemanlari direk yazabiliriz
        int[][] sayilar = {{1,2,4,5},{3,4}};
        2- outer ve inner arraylerin uzunluklarini belirterek olusturabiliriz
        int[][] sayilar = new int[3][4];

        ancak 2. yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz

       eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
       mecburen 1. yontemi kullanmalisiniz
         */
    }
}
