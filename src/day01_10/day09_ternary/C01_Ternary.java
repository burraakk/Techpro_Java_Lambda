package day01_10.day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        //kullanicidan bir sayi alip mutlak degerini yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        System.out.println(sayi>=0 ? sayi : (-1 * sayi));
    }
}
