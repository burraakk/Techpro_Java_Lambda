package day01_10.day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {
        //kullanicidan 4 basamakli bir sayi al ve rakamlari toplamini yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz...");
        int sayi = scan.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi = sayi;

        //su anda ornek sayi 5267, birlerBasamagi 0, rakamlarToplami 0

        birlerBasamagi = sayi % 10; //7
        rakamlarToplami += birlerBasamagi; //7
        sayi /= 10; //526

        //su anda sayi 526, birlerBasamagi 7, rakamlarToplami 7

        birlerBasamagi = sayi % 10; //6
        rakamlarToplami += birlerBasamagi; //7+6=13
        sayi /= 10; //52

        //su anda sayi 52, birlerBasamagi 6, rakamlarToplami 13

        birlerBasamagi = sayi % 10; //2
        rakamlarToplami += birlerBasamagi; //13+2=15
        sayi /= 10; //5

        //su anda sayi 5, birlerBasamagi 2, rakamlarToplami 15

        birlerBasamagi = sayi % 10; //5
        rakamlarToplami += birlerBasamagi; //15+5=20
        sayi /= 10; //0

        //su anda sayi 0, birlerBasamagi 5, rakamlarToplami 20

        System.out.println("Girdiginiz "+ilkGirilenSayi+" sayisinin rakamlari toplami : " + rakamlarToplami);

    }
}
