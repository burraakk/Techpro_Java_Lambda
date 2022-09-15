package day31_40.day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen{

    Matematikciler(){

        System.out.println("Matematikciler Parametresiz Cons");
    }

    Matematikciler(String isim){
        this();
        System.out.println("Matematikciler Parametreli Cons");
    }

    public static void main(String[] args) {

        Matematikciler obj1 = new Matematikciler("Ali");

    }
    /*
    this() constructor call icinde bulunulan classtaki constructorlari
    super() ise parent classta bulunan constructorlari cagirir

    this() veya super() parametre yapisina uygun bir constructor bulamazsa
    Java CTE verir

    constructor konusunda gordugumuz "this."
    o classtaki instance variable'lari refere ediyordu

    inheritance'da da "super." vardir
    parent classtaki instance'lari refere eder
     */
}
