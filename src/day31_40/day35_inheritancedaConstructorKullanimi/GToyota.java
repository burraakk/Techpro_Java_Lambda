package day31_40.day35_inheritancedaConstructorKullanimi;

public class GToyota {

    GToyota(){

        System.out.println("GToyota Parametresiz Cons");
    }

    GToyota(String isim){
        //super(isim);   extends olmadigi icin super cons. call'u java kabul etmez
        System.out.println("GToyota Parametreli Cons");
    }


}
