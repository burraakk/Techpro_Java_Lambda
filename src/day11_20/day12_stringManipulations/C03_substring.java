package day11_20.day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartNo = "1234 5678 7458 9658";

        System.out.println(isim.substring(3));// eyman
        System.out.println(soyisim.substring(soyisim.length()-3));//fil

        System.out.println(isim.substring(2,4));//le

        /*
         isim ve soyismin ilk harfi buyuk harf, geriye kalan *
         kredi kartinin ilk 4 rakami gorunsun geriye kalan *
        */

        String isimILkHarf = isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar = isim.substring(1).replaceAll("\\w","*");

        String soyisimILkHarf = soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar = soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4 = kartNo.substring(0,4);
        String kkGeriyeKalanlar = " **** **** ****";

        System.out.println(isimILkHarf+isimGeriyeKalanlar+" "+
                soyisimILkHarf+soyisimGeriyeKalanlar+"\n"+
                kkIlk4+kkGeriyeKalanlar);
    }
}
