package day31_40.day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla {

    KDizelCorolla(){

        System.out.println("KDizelCorolla Parametresiz Cons");
    }

    KDizelCorolla(String isim){
        super(isim);
        System.out.println("KDizelCorolla Parametreli Cons");
    }

    public static void main(String[] args) {

        KDizelCorolla obj1 = new KDizelCorolla("Can");


    }
}
