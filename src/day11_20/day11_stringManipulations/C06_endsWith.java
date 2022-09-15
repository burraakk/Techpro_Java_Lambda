package day11_20.day11_stringManipulations;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {
        /*
        Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "Lutfen gmail adresinizi giriniz..",
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi",
        @gmail.com ile bitmiyorsa ""utfen adresin yazimini kontrol edin" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi yaziniz");
        String input = scan.nextLine();


        if (!input.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresinizi giriniz..");
        } else if (input.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        } else
            System.out.println("Lutfen adresin yazimini kontrol edin");
    }
}
