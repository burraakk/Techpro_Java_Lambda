package day31_40.day35_inheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel{


    EMuhasebe(){

        System.out.println("EMuhasebe Parametresiz Cons");
    }

    EMuhasebe(String isim){

        System.out.println("EMuhasebe Parametreli Cons");
    }
}
