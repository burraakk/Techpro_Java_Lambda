package day31_40.day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz
        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya ekleme
        veya update yapmak istersek
        FileOutputStream Class'indan yardim aliriz
         */

        FileInputStream fis = new FileInputStream("src/day31_40.day39_exceptions/Test.txt");

        /*
        Goruldugu gibi Compile Time'da altini kirmizi cizen her durum
        Compile Time Error degildir
        java'da bazi exceptionlar da
        Compile Time Exception'dir
        Ozellikle dosya okuma ve yazma ile ilgili exceptionlar
        Compile Time Exception'dir

        Compile Time Exception olustugunda
        Java cozum icin iki ihtimal onerir
        1. Try-Catch ile cevrelemek
        2. Method signature'ina throws keyword ile beklenen exception turunu yazmak

        throws Exception, sadece olayin farkinda oldugumuzun deklarasyonudur
        exception'in handle edilmesinde hicbir rolu yoktur
        Yani try-catch ile kontrol altina aldigimiz exception'larda
        kod calismaya devam ediyordu
        Ancak throws Exception yazdigimizda Java bir exception ile karsilasirsa
        hicbir sey yapmamamisiz gibi hata mesaji yayinlayip calismayi durdurur
         */

    }
}
