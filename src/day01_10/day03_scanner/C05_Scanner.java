package day01_10.day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi alip sayilarin
        çarpimini yazdir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi girin..");
        double sayi1 = scan.nextDouble();
        //İkinci sayi için 2. ve 3. adimlari tekrarla
        System.out.println("Lutfen ikinci sayiyi giriniz..");
        double sayi2 = scan.nextDouble();

        System.out.println("Girilen sayilarin carpimi: " + sayi1*sayi2);


    }
}
