package day31_40.day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    Extends keyword kullanilan classlarda
    ister default constructor bulunsun
    istersek de biz yeni constructor(lar) olusturalim
    Java constructor'in ilk satirina
    super(); constructor call yazar

    super(); constructor call default constructor'a benzer
    gorunmese de orada vardir ve calisir
    ancak biz ilk satira farkli bir constructor call yazarsak
    Java super(); constructor'ini siler

    Eger biz mudahale edip kendi constructor call'umnuzu olusturmazsak
    Java'nin default olarak olusturdugu constructor call
    her zaman parametresizdir
    super();


     */

    FMemur(){
        System.out.println("FMemur Parametresiz Cons");
    }

    FMemur(String isim){
        System.out.println("FMemur Parametreli Cons");
    }

    public static void main(String[] args) {

        FMemur mmr1 = new FMemur("Ali");


    }

}
