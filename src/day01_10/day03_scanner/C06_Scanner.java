package day01_10.day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*Kullanicidan isim,soyisim,yasini al
        girilen bilgiler = mahmut tuncer 57
        seklinde yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim = scan.nextLine();
        //burada tek kelime ile sınırlamamak icin nextLine() methodu kullandik
        //next() methodu ilk bosluga kadar, nextLine() satır sonuna kadar alır
        System.out.println("Soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("Girilen bilgiler = "+isim+" "+soyisim+" "+yas);

    }
}
