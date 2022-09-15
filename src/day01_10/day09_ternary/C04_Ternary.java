package day01_10.day09_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin
        kucuk harf ise consola “Kucuk Harf”
        buyuk harfse consola “Buyuk Harf”
        yoksa “girdiginiz karakter harf degil” yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char harf = scan.next().charAt(0);

        String sonuc = harf>='a' && harf<='z' ? "Kucuk Harf" :
                harf>='A' && harf<='Z' ? "Buyuk Harf" : "Gecersiz Karakter" ;
        System.out.println(harf+" --> "+sonuc);

        //paranteze yazip okunakli hale getirebiliriz fakat yukarıdaki gibi
        //parantez olmadan da kullanilabilir
        String sonuc2 = (harf>='a' && harf<='z') ? ("Kucuk Harf") :
                (harf>='A' && harf<='Z') ? ("Buyuk Harf") : ("Gecersiz Karakter") ;
        System.out.println(sonuc2);


    }
}
