package practice.practice05;

import java.util.Scanner;

public class Q02_ForLoop {

     /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	        hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("1'den buyuk bir tam sayi giriniz : ");
         int sayi = scanner.nextInt();
         int toplam = 0;

         for (int i = 1; i < sayi ; i++) {
             toplam += i*i;
         }
         System.out.println("Sayilarin kareleri toplami : "+toplam);
     }
}
