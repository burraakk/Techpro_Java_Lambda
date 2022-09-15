package day01_10.day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatement {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        //KUllanici PAZAR,pazar,Pazar,PaZaR vs. hangisini girer bilemeyiz
        //bu yüzden tüm harfleri buyultur veya kuculturuz

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilern gun haftasonudur");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
        || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
        || girilenGun.equals ("cuma")){
            System.out.println("Girilen gun hafta icidir...");
        }

        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
        || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
        || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
        ||girilenGun.equals("pazar"))){
            System.out.println(girilenGun + " diye gun mu olur..");
        }



    }
}
