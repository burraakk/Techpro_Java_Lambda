package practice.practice03;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen isminizi ve soyisminizi giriniz..\nIsim : ");
        String isim = scanner.nextLine();
        System.out.print("Soyisim : ");
        String soyisim = scanner.nextLine();

        if (isim.length() > soyisim.length()) {
            System.out.println("Isminiz soyisminizden uzundur..");
        } else if (isim.length() == soyisim.length()) {
            System.out.println("Isminiz ve soyisminiz esit uzunluktadir..");
        }else
            System.out.println("Soyisminiz isminizden uzundur..");
    }
}
