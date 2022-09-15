package day01_10.day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        //kullanicidan isim al,ilk harfi buyuk yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi giriniz..");
        /* Java Scanner classinda nextChar() methodu yoktur
        Onun yerine String olarak ilk kelimeyi alip
        onun da ilk harfini alabiliriz
         */
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("Ismin ilk harfi : "+ilkHarf);

    }
}
