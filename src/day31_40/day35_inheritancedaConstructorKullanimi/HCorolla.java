package day31_40.day35_inheritancedaConstructorKullanimi;

public class HCorolla extends GToyota{

    HCorolla(){

        System.out.println("HCorolla Parametresiz Cons");
    }

    HCorolla(String isim){
        super(isim);
        System.out.println("HCorolla Parametreli Cons");
    }
}
