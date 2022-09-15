package day31_40.day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe{

    int saatUcreti = 12;
    int gunlukMesai = 9;

    protected void maas(){
        System.out.println("Memurlar : " + (30*saatUcreti*gunlukMesai) + " maas alir.");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai); // 9 - Personel
        System.out.println(mmr1.saatUcreti); // 12 - Personel
        mmr1.maas(); // Memurlar : 3240 maas alir. - Personel
        mmr1.ozelSigorta(); // Memurlar %60 indirimli ozel sigorta yaptirabilir - Personel
        mmr1.sigorta(); // Personel
        System.out.println(mmr1.isim); // Personel
        System.out.println(mmr1.soyisim); // Personel
        System.out.println(mmr1.departman); // Personel

        BMuhasebe mhsb1 = new BMuhasebe();
        /*
        her ne kadar memur classinin icnde olsam da
        olusturdugum obje BMuhasebe classindan
        cunku data turu ve constructor BMuhasebe

        String str = "Murat";
        ArrayList<Integer> list = new ArrayList<>();
        Integer sayi = 20;
        BMuhasebe classi da obje olusturulabilen bir classtir, yani bir DATA TURUDUR!!!
         */
        System.out.println(mhsb1.gunlukMesai); // 8 - Muhasebe
        System.out.println(mhsb1.saatUcreti); // 10 - Muhasebe
        mhsb1.maas(); // Personel minimum : 2400 maas alir. - Muhasebe
        mhsb1.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir. - Muhasebe
        mhsb1.sigorta(); // Personel
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departman); // Personel




    }
}
