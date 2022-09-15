package day01_10.day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatement {
    public static void main(String[] args) {
        /*
        kullanicidan bir karakter iste
        harf olup olmadigini yazdir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz..");
        char karakter = scan.next().charAt(0);

        if ((karakter>='a' && karakter<='z') ||(karakter>='A' && karakter<='Z')){
            System.out.println("Girilern karakter bir harf..");
        } else {
            System.out.println("Girdiginiz sey harften baska her seye benziyor..");
        }
    }
}
