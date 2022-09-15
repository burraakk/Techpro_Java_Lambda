package day21_30.day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

               C01           obj1      =     new         C01();
        // class adi     objenin adi       keyword     constructor

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        List<String> arr = new ArrayList<>();

        /*
        Constructor Javada obje olusturabilmek icin kullanilan kod blogudur

        Javada bir obje olusturabilmek icin mutlaka constructor kullanmalisiniz
         */

        System.out.println(obj1.sayi);// 0
        obj1.deneme();  // "C01'den deneme methodu calisir"

    }
}
