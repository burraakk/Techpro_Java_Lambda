package day21_30.day25_constructor;

public class C01 {
    /*
    Java OOP konsept kullandigi icin
    olusturulan her classin ihtiyac oldugunda
    obje uretebilmesine uygun dizayn etmistir
    Ama her classtan obje uretilmeyebilir

    bunun icin Java ihtiyac halinde kullanilmasi icin
    her classta default bir constructor koymustur

    bu default constructor
    classtan obje olusturuldugunda otomatik olarak calisir

    ornegin bu classta constructor gorunmemesine ragmen C02 classinda
    icinde oldugumuz C01 classindan bir obje uretebildik
     */

    int sayi;

    public void  deneme(){
        System.out.println("C01'den deneme methodu calisir");
    }
}
