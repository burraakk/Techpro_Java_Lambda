package day01_10.day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        kullanicidan bir sayi isteyin
        sayi pozitifse sayiyi yazdirin
        sayi sifir veya negatifse bir sayi daha isteyin ve ikisinin carpimini yazdirin
         */

        /*
        EGER IF ELSE ICERISINDE YENI KODLAR VARSA
        BASIT TERNARY ILE YAPMAMIZ MUMKUN OLMAZ
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        double sayi = scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);
        }else {
            System.out.println("Bir sayi daha giriniz...");
            double sayi2 = scan.nextDouble();
            System.out.println(sayi*sayi2);
        }

    }
}
