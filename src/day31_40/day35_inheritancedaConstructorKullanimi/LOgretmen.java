package day31_40.day35_inheritancedaConstructorKullanimi;

public class LOgretmen {

    LOgretmen(){

        System.out.println("LOgretmen Parametresiz Cons");
    }

    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen Parametreli Cons");
    }
}
