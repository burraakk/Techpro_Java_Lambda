package day01_10.day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //C06'daki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla isim,soyisim ve yasinizi giriniz\nAralarda Enter tusuna basiniz..");

        String isim = scan.nextLine();
        scan.nextLine();
        String soyismi = scan.nextLine();
        scan.nextLine();
        int yas2 = scan.nextInt();

        System.out.println("Girilen bilgiler = "+isim+", "+ soyismi +", "+yas2);

    }
}
