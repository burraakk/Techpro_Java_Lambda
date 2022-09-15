package day31_40.day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    /*
    Soru: Kullanicidan yasini girmesini isteyin.
    Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yasinizi giriniz : ");
        int yas = scanner.nextInt();


        try {
            if (yas < 0) {
                throw new IllegalArgumentException();
            }else{
                System.out.println("Yasiniz : " + yas );
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.print("Yas negatif olamaz!");
        }

    }
}
