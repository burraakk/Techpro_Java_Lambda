package day11_20.day13_methodCreation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        /*
        Soru 2-) String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz.
        -String str1 = "$13.99"
        -String str2 = "$10.55"
        ipucu= Double.parseDouble() metodunu kullanabilirsiniz.
         */

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1  = str1.replaceAll("\\D","");
        double sayi1 = Double.parseDouble(str1);
        str2  = str2.replaceAll("\\D","");
        double sayi2 = Double.parseDouble(str2);

        System.out.println("$"+(sayi1+sayi2)/100);


        System.out.println("---------------------BENIM COZDUGUM YOL---------------------");

        String fiyat1 = "$13.99";
        String fiyat2 = "$10.55";
        fiyat1 = fiyat1.substring(1);
        fiyat2 = fiyat2.substring(1);

        double fiyat1Yeni = Double.parseDouble(fiyat1);
        double fiyat2Yeni = Double.parseDouble(fiyat2);
        System.out.println("Toplam fiyat : $" + (fiyat1Yeni+fiyat2Yeni));


    }
}
