package practice.recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uc basamakli bir sayi giriniz");
        int sayi = scanner.nextInt();

        int birlerBas = sayi % 10, onlarBas = (sayi / 10) % 10, yuzlerBas = sayi / 100;

        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBas) {
                case 0: System.out.print("");break;
                case 1: System.out.print("Yuz ");break;
                case 2: System.out.print("Iki Yuz ");break;
                case 3: System.out.print("Uc Yuz ");break;
                case 4: System.out.print("Dort Yuz ");break;
                case 5: System.out.print("Bes Yuz ");break;
                case 6: System.out.print("Alti Yuz ");break;
                case 7: System.out.print("Yedi Yuz ");break;
                case 8: System.out.print("Sekiz Yuz ");break;
                case 9: System.out.print("Dokuz Yuz ");break;
            }
            switch (onlarBas) {
                case 0: System.out.print("");break;
                case 1: System.out.print("On ");break;
                case 2: System.out.print("Yirmi ");break;
                case 3: System.out.print("Otuz ");break;
                case 4: System.out.print("Kirk ");break;
                case 5: System.out.print("Elli ");break;
                case 6: System.out.print("Altmis ");break;
                case 7: System.out.print("Yetmis ");break;
                case 8: System.out.print("Seksen ");break;
                case 9: System.out.print("Doksan ");break;
            }
            switch (birlerBas) {
                case 0: System.out.print("");break;
                case 1: System.out.print("Bir ");break;
                case 2: System.out.print("Iki ");break;
                case 3: System.out.print("Uc ");break;
                case 4: System.out.print("Dort ");break;
                case 5: System.out.print("Bes ");break;
                case 6: System.out.print("Alti ");break;
                case 7: System.out.print("Yedi ");break;
                case 8: System.out.print("Sekiz ");break;
                case 9: System.out.print("Dokuz ");break;
            }
        }else System.out.println("Uc basamakli sayi giriniz");
    }
}
