package practice.recap1;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("5 basamakli bir sayi giriniz : ");
        int num = scan.nextInt();

        int ilkIki = num/1000;
        int sonIki = num%100;

        int ilkIkiToplam = (ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);
        int sonIkiToplam = (sonIki/10) + (sonIki%10);
        System.out.println("sonIkiToplam = " + sonIkiToplam);

        int toplam = ilkIkiToplam + sonIkiToplam ;
        System.out.println("toplam = " + toplam);

    }
}
