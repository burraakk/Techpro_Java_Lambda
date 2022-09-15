package day01_10.day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = sayi1+1; //11
        sayi2 += 5; //16
        /*
        pre veya post increment/decrement
        sadece ++ ve -- islemi icin gecerlidir
        bu iki islem icin sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
         */
                               //POST INCREMENT
        int sayi3 = sayi2++;//1- once(yani artirma islemi yapilmadan) sayi2 degeri sayi3'e atanacak
                        //2- sayi2 bir artirilacak ve sayi2 guncellenecek

        System.out.println("sayi3 : "+sayi3);//16
        System.out.println("sayi2 : "+sayi2);//17

                                //PRE INCREMENT
        int sayi4 = ++sayi1;//once sayi1 degeri bir artirilacak ve guncellenecek
                        //guncel sayi1 degeri sayi4'e atanacak

        System.out.println("sayi4 : "+sayi4);//11
        System.out.println("sayi1 : "+sayi1);//11

    }
}
