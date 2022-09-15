package day31_40.day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends  BMuhasebe{
    int saatUcreti = 11;
    int gunlukMesai = 7;

    protected void maasIsci(){
        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai) + " maas alir.");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        BMuhasebe isc1 = new DIsci();
        /*
        bir obje olusturulurken
        data turu ve constructor ayni class'tan ise
        direkt o class'a gidiyorduk

        eger data turu ve constructor farkli ise
        Obje constructor'in oldugu class'in objesidir
        ancak bizden istenen
        ISci classindaki spesifik ozellikler degil
        Bir iscinin muhasebe classindaki
        tum calisanlarla beraber sahip oldugu
        genel ozellikleri yazdirir

         */
        System.out.println(isc1.gunlukMesai); // 8 - Muhasebe
        System.out.println(isc1.saatUcreti); // 10 - Muhasebe
        isc1.maas(); // Personel minimum : 2400 maas alir. - Muhasebe
        isc1.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir. - Muhasebe
        isc1.sigorta(); // Personel
        System.out.println(isc1.isim); // Personel
        System.out.println(isc1.soyisim); // Personel
        System.out.println(isc1.departman); // Personel

        APersonel isc2 = new DIsci();

        //System.out.println(isc2.gunlukMesai); // ---CTE---
        //System.out.println(isc2.saatUcreti); // ---CTE---
        isc2.maas(); // Personel minimum : 2400 maas alir. - Muhasebe ??? neden muhaseden aldi ???
        //isc2.ozelSigorta(); ---CTE---
        isc2.sigorta(); // Personel
        System.out.println(isc2.isim); // Personel
        System.out.println(isc2.soyisim); // Personel
        System.out.println(isc2.departman); // Personel

        /*
        Eger data turu olan classda aradigimiz ozellik yoksa
        onun parent'ina gidebilir
        Ancak chil'a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */


        List<String> list1 = new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();
        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        list3 Queue gibi davranir
         */


    }
}
