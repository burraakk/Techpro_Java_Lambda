package practice.practice03;

import java.util.Scanner;

public class Q01_StringManipulaton {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle olusturmak icin ilk kelimeyi giriniz : ");
        String str1  = scanner.nextLine().toLowerCase();
        System.out.print("Cumle olusturmak icin ikinci kelimeyi giriniz : ");
        String str2  = scanner.nextLine().toLowerCase();
        System.out.print("Cumle olusturmak icin ucuncu kelimeyi giriniz : ");
        String str3  = scanner.nextLine().toLowerCase();
        System.out.print("Cumle olusturmak icin dorduncu kelimeyi giriniz : ");
        String str4  = scanner.nextLine().toLowerCase();

        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+" "+str2+" "+str3+" "+str4+".");
    }
}
