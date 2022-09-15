package day01_10.day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanicidan gun ismi alin
        hafta ici veya hafta sonu yazdir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gun = scan.next().toLowerCase();

        /*
        caseler ayni sonucu veriyorsa asagidaki gibi kisayoldan yapabiliriz
         */

        switch (gun){
            case "pazartesi":
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("Hafta ici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("gecersiz gun girdiniz...");
        }

        switch (gun) {
            case "pazartesi":
                System.out.println("Haftaici");
                break;
            case "sali":
                System.out.println("Haftaici");
                break;
            case "carsamba":
                System.out.println("Haftaici");
                break;
            case "persembe":
                System.out.println("Haftaici");
                break;
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
                System.out.println("HaftaiSonu");
                break;
            case "pazar":
                System.out.println("HaftaSonu");
                break;
            default:
                System.out.println("Lutfen Gecerli Bir gun giriniz");
        }

    }

}




