package day01_10.day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf = 'a';
        /*
        char yeniHarf = harf+1;
        şeklinde atama yaparak yeniHarf=98 olur ve 98 integer
        oldugundan char'a atanamaz ve hata verir
         */


        char yeniHarf = (char)(harf+1);
        /*
        bu şekilde 98'in char degeri olan b degerini
        yeniHarf variableina atayabiliriz
         */
        System.out.println(yeniHarf);

        /*
        Bazen bir variable'a olusturuldugu data turu disindan deger atanabilir
        Bunlardan bazisini Java otomatik olarak kabul eder
        Java eger bu deger atamasinda sorun olusacagini
        (data kayiplarin olabilecegi veya datanin baskalasabilecegi) gorurse
        bu durumda otomatik olarak bu atamayi kabul etmez
        sizden eger bu atamayi istiyorsaniz sorumlulugu almanizi bekler
         */

        int sayi1 = (int)7.3; //otomatik olmuyor..buraa kusurat dikkate alinmaz, yani veri kaybi olur
        System.out.println("sayi1 : "+sayi1);  //7
        double sayi2 = 10;
        System.out.println("sayi2 : "+sayi2);  //10.0
        int sayi3 = 'c';
        System.out.println("sayi3 : "+ sayi3);  //99
        char harf2 = 98;
        System.out.println("harf2 : "+harf2);  //b
    }
}
