package day01_10.day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        //kullanicidan ismini isteyin
        //girilen ismi
        //isminiz: Ismail       şeklinde yazdırın

        //insanlarin dünyasindan kod'larimizin bulunduğu class'a değer almak için
        //Scanner classini kullaniriz

        //1- Scanner projesi olusturalim
        Scanner scan  = new Scanner(System.in);

        //2- Kullaniciya ne istedigimii söyleyelim
        System.out.println("Lutfen isminizi giriniz");

        //olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        //olusturacaginiz uygun bir variable'a atayalim

        String kullaniciIsmi = scan.next();

        System.out.println("Isminiz: " + kullaniciIsmi);

    }
}
