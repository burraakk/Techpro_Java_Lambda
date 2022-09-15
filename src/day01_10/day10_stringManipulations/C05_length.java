package day01_10.day10_stringManipulations;

public class C05_length {
    public static void main(String[] args) {
        //index 0'dan,length() metodu 1'den saymaya baslar
        //en buyuk index = str.length()-1
        String str = "Java ogren, isi kap";

        System.out.println(str.length());//karakter sayisi

        System.out.println(str.charAt(str.length()-1));//son karakter

        System.out.println(str.charAt(str.length()-3));//sondan 3. karakter

        /*
        Java'da null pointer(isaretleyici) bir deger degil
        karsisina yazildigi variable'in hicbir deger olmadiginin isaretcisidir
         */

        String str2 = ""; //str2'ye bir deger atanmis mi? EVET
                        //bu deger nedir? HİCLİK
        System.out.println(str2.length()); //0

        String str3 = null; //str3'e bir deger atanmis midir? HAYIR
                            //null bu deger atamamayi isaret eder
                            //null deger atama degil "deger atanmadiginin isaretcisi"dir...
                            //yani esitlik karsisinda null olmasi atama degildir!!!!!
        //System.out.println(str3.length()); // HATA NullPointerException....deger yok ki uzunluk olsun





    }
}
