package day31_40.day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        bir sorunla karsilasmayi beklediginiz noktalarda
        if else ile sorunu yakalayip sorunu onunla cozebiliriz

        ama sorunu her zaman if else ile cozemeyecegimiz icin
        java try_catch bloklari olusturmustur

         */

        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac < 100) {
            if (b == 0) {
                System.out.println("nau nau...payda 0 oldu...");
            } else {
                System.out.println(a / b);
            }
            b--;
            sayac++;
        }
    }
}
