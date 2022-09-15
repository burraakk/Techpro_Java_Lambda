package practice.practice12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogretmenList = new ArrayList<>();
    static List<Kisi> ogrenciList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli(){

        System.out.println("====================================");
        System.out.println("OGRENCI VE OGRETMEN YONETIM PANELI");
        System.out.println("====================================");
        System.out.println("1- OGRENCI ISLEMLERI");
        System.out.println("2- OGRETMEN ISLEMLERI");
        System.out.println("Q- CIKIS");

        String secim = scanner.next().toUpperCase();

        switch (secim) {
            case "1":

                kisiTuru = "OGRENCI";
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":

                break;
            default:
                System.out.println("Hatali giris :(");
                girisPaneli();
                break;

        }



    }

    private static void islemMenusu() {

        System.out.println("Sectigin kisi turu " + kisiTuru +" \nLutfen asagidaki islemleri seciniz");

        System.out.println("============= ISLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LISTELEME\n" +
                "         4-SILME\n" +
                "         5-ANA MENU\n" +
                "         0-CIKIS");

        System.out.println("Islem tercihinizi giriniz : ");
        int secilenIslem = scanner.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                //arama();
                islemMenusu();
                break;
            case 3:
                //listeleme();
                islemMenusu();
                break;
            case 4:
                //silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();
                break;
            case 0:
                //cikis();
                break;
            default:
                System.out.println("Duzgun bisey gir!");
                islemMenusu();
                break;

        }


    }

    private static void ekle() {  //bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi
        System.out.println("***** " + kisiTuru + " ekleme sayfasina hosgeldin *****");

        scanner.nextLine();
        System.out.print("Isim - soyisim giriniz : ");
        String adSoyad = scanner.nextLine();


        System.out.print("Kimlik No giriniz : ");
        String kimlikNo = scanner.nextLine();

        System.out.print("Yasinizi giriniz : ");
        int yas = scanner.nextInt();

        if (kisiTuru.equals("OGRENCI")){
            //TO DO sonra doldurulacak
        }else{
            scanner.nextLine();
            System.out.print("Bolum giriniz : ");
            String bolum = scanner.nextLine();

            System.out.print("Sicil NO giriniz : ");
            String sicilNo = scanner.nextLine();

            Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmen);
            System.out.println(ogretmenList);

        }

    }


}
