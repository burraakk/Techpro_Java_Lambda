package day31_40.day34_inheritance;

public class Personel {
    /*
    eger parent class olacak sekilde tasarladiginiz bir class varsa
    veya ilride bu classi parent yapmak isteyenler olabilir diyorsaniz
    variable ve methodlarin
    access modifier'ini protected yapmaliyiz
     */

    protected int persNo;
    protected String isim = "Isim belirtilmedi";
    protected String departman = "Departman belirtilmedi";


    protected void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai(){
        System.out.println("Tum personerl statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesai ucretini statusune gore alir");
    }



}
