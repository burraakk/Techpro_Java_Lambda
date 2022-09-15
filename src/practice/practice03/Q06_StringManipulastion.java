package practice.practice03;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir string giriniz..");
        String str = scanner.nextLine();

        int bosluk = str.indexOf(" ");

        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");
        }else
            System.out.println("bosluk vardir");
    }
}
