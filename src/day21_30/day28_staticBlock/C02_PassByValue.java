package day21_30.day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {

        double satisFiyati = 100;

        System.out.println(indirimliFiyat(satisFiyati));  //90.0
        System.out.println(satisFiyati);
        System.out.println(indirimliFiyat(satisFiyati));  //90.0

        /*
        iki farkli methodta saatisFiyati isminde variable olabilir
        java buna itiraz etmez
        cunku scope'lari farklidir
         */

    }

    public static double indirimliFiyat(double orjinalFiyat) {
        //metodumuz %10 indirim yapip yeni fiyati
        //main metoda dondursun
        double satisFiyati = orjinalFiyat*0.9;

        return satisFiyati;
    }

}
