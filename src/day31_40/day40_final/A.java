package day31_40.day40_final;

public class A {
    String isim = "Cuneyt";
    final static String OKUL = "Yildiz Koleji";
    /*
    Bir variable final olarak tanimlandiysa
    baska classlardan veya icinde oldugumuz classtan
    bu variable'a baska deger atanmasi mumkun degildir

    madem ki deger degidtirilemiyor
    genelde static de yaparak bu variable'a erisim kolaylastirilabilir

    Genelde static final olarak belirlenen variable isimleri
    BUYUK HARFLE yazilir
     */

    final void finalMethod(){
        System.out.println("final method'lar override edilemez");
        /*
        Bir methodu final olarak isaretlerseniz
        bu method degistirilemez demektir
         */
    }

}
