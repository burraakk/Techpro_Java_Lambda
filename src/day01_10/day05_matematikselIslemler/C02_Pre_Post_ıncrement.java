package day01_10.day05_matematikselIslemler;

public class C02_Pre_Post_ıncrement {
    public static void main(String[] args) {

        int sayi = 10;

        System.out.println("pre-increment : " + ++sayi);//once sayi variable'ını 1 artirip 11 yazdirir

        System.out.println("post-increment : " + sayi++);//once 11 yazdirip sonra artirir

        System.out.println("post-increment'den sonra : " +sayi);//bir onceki satirda post-increment sonrasi
                                                                //sayi 1 artar ve sayi variable'ı 12 olur

        sayi++;//13    tek baslarina kullanilirken ikisi de ayni islemi yapar
        ++sayi;//14    ve degeri 1 artirir
        System.out.println("en son : "+sayi);

    }
}
