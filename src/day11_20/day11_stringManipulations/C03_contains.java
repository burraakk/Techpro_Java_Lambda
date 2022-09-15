package day11_20.day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        /*
        Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin,
        @gmail.com ile bitiyorsa “Email adresiniz kaydedildi”,
        @gmail.com ile bitmiyorsa"lutfen yazilimi kontrol edin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi yaziniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresinizi giriniz.. ");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
