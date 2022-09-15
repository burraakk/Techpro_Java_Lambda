package day31_40.day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{
    int saatUcreti = 9;
    int gunlukMesai = 8;

    protected void maas(){
        System.out.println("Yan Hizmetliler : " + (30*saatUcreti*gunlukMesai) + " maas alir.");
    }

    protected void issizlikSigortasi(){
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        Overriding child class'taki bir methodun
        parent class'taki ayni isimdeki bir methodu
        etkisiz hale getirerek
        kendi spesifik ozelligini ortaya cikarmasidir

        soru : Overriding'i nerede dikkate aliyoruz?
        cevap : Bir obje olusturulurken data turu ve constructor farkli ise.

        eger bir obje olusturulurken data turu ve construcyor farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz
        1. Obje constructor'in oldugu class'da olusur
        2. Objenin ozelliklerini aramaya data turunun oldugu classtan baslariz
           bu classta aranan ozellik bulunamazsa parent classlara bakilir
           orada da bulamazsak CTE verir
        3.
           - Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz

           - Aranan ozellik method ise degeri yazdirmadan once
            Override edilmis mi diye kontrol etmemiz gerekir
            Eger override edildiyse en guncel degeri yazdiririz
         */

        BMuhasebe yh1 = new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai); // 8 - Muhasebe
        System.out.println(yh1.saatUcreti); // 10 - Muhasebe
        yh1.maas(); // Yan Hizmetliler : 2160 maas alir. - YanHizmetler (Override)
        yh1.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir. - Muhasebe
        yh1.sigorta(); // Personel
        System.out.println(yh1.isim); // Personel
        System.out.println(yh1.soyisim); // Personel
        System.out.println(yh1.departman); // Personel
        //System.out.println(yh1.issizlikSigortasi);
        //Aramaya muhasebeden basladigimiz icin issizlikSigortasi bulamadik
        //Dolayasiyla CTE verdi



    }
}
