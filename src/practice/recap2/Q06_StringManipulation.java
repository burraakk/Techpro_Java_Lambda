package practice.recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String1 : ");
        String str1 = scanner.nextLine();
        System.out.print("String2 : ");
        String str2 = scanner.nextLine();

        System.out.println("1. yontem :" + str1 + " " + str2);
        System.out.println("2. yontem :" + str1.concat(" " + str2));


        String str1_0indextenSonrasi = str1.substring(1);
        String str2_0indextenSonrasi = str2.substring(1);

        System.out.println("Manipulation sonraki hali : " + str1_0indextenSonrasi.concat(" " + str2_0indextenSonrasi));
        System.out.println("Manipulation sonraki hali : " + str1_0indextenSonrasi + str2_0indextenSonrasi);
    }
}
