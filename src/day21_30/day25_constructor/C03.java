package day21_30.day25_constructor;

public class C03 {
    /*
    proje olustururken bazi classlar run etmek icin degil
    variable ve method olusturup
    bunlari baska classlardan kullanmak iicin olusturulur
     */
    /*
    Default constructor, parametresizdir
    Goremesek bile ihtiyac halinde calisir

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olusturursak
    java default constructor'ı siler.
     */

    C03(){

    }
    /*
    Olusturdugumuz parametresiz bu constructor
    Default Constructor ile birebir aynidir
    Ama biz olusturdugumuz icin buna Default Constructor DEMEYİZ
    Parametresiz Constructor deriz
     */
    String isim = "Etka";

    public void method01() {
        System.out.println("C03 method calisti");
    }
}
