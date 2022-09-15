package day21_30.day24_arraylists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
         /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */
        Random rand = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 20) {
            sayi = rand.nextInt(100);

            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }


        boolean biildiMi = false;
        int tahminsayisi = 1;
        Scanner scanner = new Scanner(System.in);

        while (!biildiMi) {

            System.out.print("Lutfen bir sayi tahmininde bulunun : ");
            sayi = scanner.nextInt();

            if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler, " + tahminsayisi + " tahminde listeden bir sayi bulmayi basardiniz.");
                System.out.println("Sayi listesi : "+sayiListesi);
                biildiMi = true;
            } else {
                System.out.println(tahminsayisi + " tahminde bulundunuz, hicbiri listede yok.");
                tahminsayisi++;
            }
        }

    }
}
