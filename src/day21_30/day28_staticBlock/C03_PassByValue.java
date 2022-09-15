package day21_30.day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        %25 indirimli fiyati hesaplayip
        bize donduren bir method olusturun
         */

        double satisFiyati = 100;
        double indirimOrani = 25;

        double indirimliFiyat = indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("Indirimli Fiyat = " + indirimliFiyat);

        double patates = indirimliFiyatHesapla2(satisFiyati,indirimOrani);
        System.out.println("Indirimli Fiyat = " + patates);
    }

    public static double indirimliFiyatHesapla(double satisFiyati,double indirimOrani) {
        double indirimliFiyat = satisFiyati * (1-indirimOrani/100);

        return indirimliFiyat;
    }

    public static double indirimliFiyatHesapla2(double maldonado, double pikachu) {
        double patates = maldonado * (1-pikachu/100);

        return patates;
    }
}
