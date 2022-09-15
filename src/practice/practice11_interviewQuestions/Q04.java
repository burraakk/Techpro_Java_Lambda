package practice.practice11_interviewQuestions;

import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    //bunu kart sifre kontrol de de kullabilirinisz
    public static void main(String[] args) {

        String sifrem = "burak.1907";
        int girisHakki = 3;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Sifre giriniz");
            String girilenSifre = scanner.nextLine();

            if (sifrem.equals(girilenSifre)){
                System.out.println("Sifre dogru...Giris basarili...");
                break;
            }else{
                System.out.println("Sifre yanlis...");
                girisHakki--;
                System.out.println("Kalana giris hakki : " + girisHakki);
            }

            if (girisHakki==0){
                System.out.println("Giris hakkiniz kalmadi!");
                break;
            }
        }

    }
}
