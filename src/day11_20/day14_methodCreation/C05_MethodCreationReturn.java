package day11_20.day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        Kullanicidan sehir ismini ve dogum tarihini alip
        bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        sehir ismini programimizda buyuk harf olarak,
        dogum tarihini ise 2022-06-30 seklinde kullanmak istiyoruz
         */
        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("tarih = " + tarih);
        System.out.println("sehir = " + sehir);

    }
    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Yil giriniz : ");
        int yil = scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih = yil+"-";
        }else
            System.out.println("Yil icin gecerli bir sayi yazmalisiniz(1900-2100)");

        System.out.println("Kacinci ay oldugunu tam sayi olarak yazininz : ");
        int ay = scan.nextInt();
        if (ay<=0 || ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");
        } else if (ay<10) {
            tarih = tarih+"0"+ay+"-";
        }else
            tarih = tarih+ay+"-";

        System.out.println("Lutfen ayin hangi gunu oldugunu tam sayi olarak girin");
        int gun = scan.nextInt();
        if(gun<=0 || gun>31){
            System.out.println("Gun olarak 1-31 arasinda bir sayi girilmelidir");
        } else if (gun<10) {
            tarih = tarih + " " + gun;
        }else
            tarih = tarih+gun;
        return tarih;
    }
    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz");
        String sehir = scan.nextLine().toUpperCase();

        return sehir;

    }
}
