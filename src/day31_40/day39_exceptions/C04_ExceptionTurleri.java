package day31_40.day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
        System.out.println(str);
        Deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
        Java Compile Time'da bunu farkeder ve size izin vermez
         */

        str = null;
        //System.out.println(str.length()); ---> NullPointerException

        Object obj = "Java Java Java";
        Integer sayi = (Integer) obj;

        /*
        String str2 = "Java Java";
        Integer sayi2 = str2;
        Java bazi casting islemlerine Compile time'da izin vermez

        Ancak bazen syntax uygun olabilir
        Bu durumda java kodun calismasina itiraz etmez
         */

        Thread.sleep(5000);

    }
}
