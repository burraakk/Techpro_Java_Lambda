package day31_40.day40_final;

final public class B extends A{
    public static void main(String[] args) {

        B obj = new B();
        obj.isim = "Alp";
        //obj.OKUL = "Java Koleji";  final oldugu icin degistirilemez

        System.out.println(B.OKUL);

        System.out.println(Integer.MAX_VALUE); //ornegin bu MAX_VALUE ve MIN_VALUE degismeyecegi icin
        System.out.println(Short.MIN_VALUE);  // Java tarafindan final olarak atanmistir, degistirilemez !!

        /*
        bir class final olarak belirlendiginde
        o class inherit edilemez
         */
    }
}
