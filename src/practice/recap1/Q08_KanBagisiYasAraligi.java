package practice.recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {


		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            System.out.println("yasinizi giriniz");
            int yas = scan.nextInt();
            System.out.println("kilonuzu giriniz");
            int kilo = scan.nextInt();

            if (yas>0 && yas<18){
                System.out.println("Yasi 18'den kucuk olanlar kan bagisi yapamazlar");
            } else if (yas>=18) {
                if (kilo>0 && kilo<50) {
                    System.out.println("Kilonuz 50'den kucuk oldugu icin kan bagisi yapamazsiniz");
                } else if (kilo >= 50) {
                    System.out.println("Kan bagisi yapabilirsiniz..");
                } else System.out.println("Gecersiz kilo girdiniz..");
            }else System.out.println("Gecersiz yas girdiniz");
        }
}