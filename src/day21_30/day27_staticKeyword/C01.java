package day21_30.day27_staticKeyword;

public class C01 {

    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {

        /*
        Class level'da iki tur variable olusturulabiliriz
            -static variable'in diger adi CLASS VARIABLE
            -instance variable'in diger adi OBJE VARIABLE

            static variable'lar tum classtan kullanilabilir
            instance variable'lar direkt olarak sadece static olmayan methodlardan kullanilabilir

            instance variable'lara static methoddan ulasmak icin obje olusturmak gerekir

            instance variablelar obje variable oldugu icin
            herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
            OBJE OLUSTURULAN SATIRDAN ITIBAREN kod incelenmelidir

            satatic variable'lar class variable oldugu icin
            herhangi bir satirda satatic variable'in degerinin ne oldugunu bulmak icin
            CLASS BASINDAN ITIBAREN kod incelenmelidir
         */

        C01 obj1 = new C01();
        System.out.println("obj1'in rakam degeri : " + obj1.rakam);  //5
        System.out.println("obj1'in rakam degeri : " + obj1.sayi); //10

        obj1.rakam += 1;  //5+1 = 6
        obj1.sayi += 1;   // 10+1 = 11

        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : " + obj1.rakam);  //6
        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : " + obj1.sayi); //11


        C01 obj2 = new C01();
        System.out.println("obj2'in rakam degeri : " + obj2.rakam);  //5
        System.out.println("obj2'in rakam degeri : " + obj1.sayi); //11

        obj2.rakam ++;  //5+1 = 6
        obj2.sayi ++;   //11+1 = 12

        System.out.println("1 artirdiktan sonra obj2'in rakam degeri : " + obj2.rakam);  //6
        System.out.println("1 artirdiktan sonra obj2'in rakam degeri : " + obj2.sayi); //12



    }
}
