package practice.practice10.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
     * ogretmen bilgilerini kullanicidan aliniz
     * aldiginiz bilgilerrden object ureterek yeni
      ogretmenler olusturun ve bilgilerini yazdirin
     */
    static Scanner scanner = new Scanner(System.in);
    static List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Okulumuza Hosgeldiniz");


        System.out.println("Isim giriniz");
        String isim = scanner.nextLine();

        System.out.println("Soyisim giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scanner.nextInt();
        scanner.nextLine(); // dummy komut

        System.out.println("Bransinizi giriniz");
        String brans = scanner.nextLine();

        System.out.println("Telefon numaranizi giriniz");
        String tel = scanner.nextLine();

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim,soyisim,yas,brans,tel);

        ogretmenList.add(adayOgretmen);
        System.out.println("ogretmenList = " + ogretmenList);

    }
}
