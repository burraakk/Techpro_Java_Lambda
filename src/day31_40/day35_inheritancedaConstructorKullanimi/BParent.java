package day31_40.day35_inheritancedaConstructorKullanimi;

public class BParent extends AGrandParent{

    protected String isim= "BParent ismi belirtilmedi";
    protected String parentKlupAdi = "Parent Klubu";

    BParent() {
        System.out.println("BParent constructor calisti");
    }
}
