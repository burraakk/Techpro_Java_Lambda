package day31_40.day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac < 100) {
            /*
            try blogu yapmaya calistigimiz ancak risk oldugunu dusundugumuz
            islemleri yapmak icin kullanilir

            catch'ten sonraki parantez
            karsilasmayi bekledigimiz java turunu javaya soylemek icin kullanilir
            catch blogu : Javaya soyledigimiz istisnai durum gerceklesirse
            javanin yapmasini istedigimiz islem

            catch blogunun onundeki paranteze karsilasmayi bekledigimiz exceptionu yazabiir
            veya her turlu exceptionda devreye girmesini istiyorsak
            tum exceptionlarin parenti olan Exception yazabiliriz
             */

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("nau nau...payda 0 oldu..");;
            }
            b--;
            sayac++;
        }
    }
}
