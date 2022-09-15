package day31_40.day37_overriding;

public class GCokluClass {
    public void metot(){

    }
}
/*
IntelliJ'de actigimiz class icinde
sadece bir puplic class bulunabilir

class sinirlari disinda PUBLIC OLMAYAN baska classlar da olusturabiliriz
ancak projede yazdigimiz class ismini public yapmazsak,
proje ile class arasinda sorun olacagindan CTE olur.

 */

class ikinciClass extends GCokluClass{
    @Override
    public void metot() {

    }
}

class ucuncuClass extends ikinciClass{
    @Override
    public void metot() {

    }
}
