package practice.practice02;

import java.util.Scanner;

public class Q01_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz : ");
        int sayi = scan.nextInt();
        System.out.print("Ikinci tam sayiyi giriniz : ");
        int sayi2 = scan.nextInt();
        System.out.println("Toplam = " + (sayi+sayi2));

    }

}
