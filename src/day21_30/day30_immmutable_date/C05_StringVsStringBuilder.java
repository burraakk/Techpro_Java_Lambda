package day21_30.day30_immmutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    /*
    String mi yoksa StringBuilder mi daha hizlidir??
    bunun icin bir string olusturup 1000 kere sonuna nokta ekleyelim
    oncesi ve sonrasinda zamani alip aradaki farki bulalim

    ayni islemi StringBuilder icin de yapalim
     */
    public static void main(String[] args) {
        String str = "Ahhhh Java";

        LocalTime baslangic = LocalTime.now();

        for (int i = 0; i < 10000; i++) {
            str += ".";
        }
        LocalTime bitis = LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman : "+ (bitis.getNano()-baslangic.getNano()));



        StringBuilder sb = new StringBuilder("Ahhhh Java");

        baslangic = LocalTime.now();

        for (int i = 0; i < 10000; i++) {
            sb.append(".");
        }
        bitis = LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("StringBuilder zaman : "+ (bitis.getNano()-baslangic.getNano()));
    }
}
