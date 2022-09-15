package day11_20.day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[] = new int[3]; //length belirlendikten sonra ilerleyen satirlarda degismez!! (tepsi hep aynı kalir)

        //non-primitive data türündeki dataları her zaman direk yazdırmaz
        //Array'i yazdırmak icin Arrays class'ından yardim isteriz
        System.out.println(sayilar);//[I@b4c966a -----> bu heap'te bulunan [0,0,0] seklindeki array'in
                                                         //stack'teki referansı..
        System.out.println(Arrays.toString(sayilar));// [0,0,0]

        sayilar[2] = 10;
        sayilar[0] = 5;
        sayilar[1] = 3;

        System.out.println(sayilar);
        System.out.println(Arrays.toString(sayilar));


        String sinifList[] = {"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList));

        sinifList[1] = "Hasan";
        System.out.println(Arrays.toString(sinifList));

        System.out.println(sinifList[1]); // Hasan
        System.out.println(sinifList[0]); // Ali
        System.out.println(sinifList[2]); // Ahmet

    }
}
