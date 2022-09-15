package day21_30.day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static{
        /*
        static block class uyelerinini tamamindan once calisir
        (main methoddan bile once calisir)

        static block class olusturuldugunda calisir
        genellikle de classla ilgili on ayarlamalar
        veya static variable'lara deger atamak icin kullanilir

        static blocklarin class icerisinde nerede oldugu onemli degildir
        once static blocklar calisir

        birden fazla static block varsa yukaridan asagi dogru calisir
         */
        System.out.println("static block calisti");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);
    }

    static{
        System.out.println("main method altindaki static block calisti");
    }
}
