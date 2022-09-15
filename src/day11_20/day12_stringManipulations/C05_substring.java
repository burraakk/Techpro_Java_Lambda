package day11_20.day12_stringManipulations;

import java.util.Scanner;

public class C05_substring {
    public static void main(String[] args) {
        //Kullanicidan 4 harfli bir kelime iste,girilen kelimeyi tersten yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz...");
        String input = scan.nextLine();

        String tersInput = input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersInput);


    }
}
