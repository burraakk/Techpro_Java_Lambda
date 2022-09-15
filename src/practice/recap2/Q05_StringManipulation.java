package practice.recap2;

import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz..");
        String firstName = scanner.nextLine(), lastName = scanner.nextLine();

        String fullName = firstName.concat(" " + lastName).toUpperCase();
        System.out.println("fullName = " + fullName);
    }


}
