package day31_40.day34_inheritance;

public class Isci extends Personel{
    /*
    Normal hayatimizda parent cocuk sahiibi olmaya karar verebilir
    Java'da ise child classlar ozelliklerini inherit etmek istedikleri class'i
    kendilerine parent edinirler

    mesela isci classini olusturunca nelere ihtiyaci var diye dusunsek
    Personel cllassindaki tum variable ve methodlara ihtiyaci
    oldugunu gorebiliriz
    Bu durumda yeniden o variable ve methodlari olusturmak yerine
    Personel classini kendimize parent ederiz

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz

    bir class baska bir class'i parent edindiginde
    1- parent classtaki tum ozelliklere(variable ve method)
        otomatik olarak sahip olur
    2- parent classtaki ozelliklerden bazilarini
        kendine uyarlayabilir
    3- parent classta olmayan bazi yeni ozellikler olusturabilir
    not : parent classtaki ozellikler degistirebilir veya gormezden gelebilir
        ancak hicbirini reddedemez

     */

    int persNo = 1001;

    public static void main(String[] args) {

        Isci isci1 = new Isci();
        System.out.println(isci1.isim); //Isim belirtilmedi
        //kendi classimizda isim variable olmadigi icin parent'a gideriz
        isci1.isim = "Selim";
        System.out.println(isci1.isim); // Selim

        System.out.println(isci1.persNo); //1001
        //kendi classimizda persNo oldugundan onu kullaniriz

        isci1.maas(); // Isciler minimum 15 euro saat ucreti alir
    }

    public void maas(){
        System.out.println("Isciler minimum 15 euro saat ucreti alir");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }


}
