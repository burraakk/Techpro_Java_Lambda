package day01_10.day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        kullanicidan 4 basamakli sayi iste
        sayi 5'e bolunuyorsa son rakami kontrol et
        son rakam 0 ise "5'e bolunen cift sayi" yazdirin
        son rakam 5 ise "5'e bolunen tek sayi" yazdirin
        sayi 5'e bolunmuyosa "tekrar deneyin" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<1000 || sayi>9999){
            System.out.println("Girdiginiz sayi 4 basamakli degil...");
        } else if (sayi%5==0) {

            if (sayi%10==0){
                System.out.println("Girdiginiz sayi 5'e bolunebilen bir cift sayidir");
            }else {
                System.out.println("Girdiginiz sayi 5'e bolunebilen bir tek sayidir");
            }

        }else {
            System.out.println("Girdiginiz sayi 5'e tam bolunmuyor...");

        }

    }
}
