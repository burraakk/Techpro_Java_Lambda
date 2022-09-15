package day21_30.day26_constructor;

public class Kamyon {
    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
                                //"bu class'in instance'i olan marka variable'ina
        this.marka = marka;     //bu constructor'a marka olarak geln degeri ata" demek...
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

        /*
        Bizim temel amacimiz KamyonRunner classinda argument olarak girilen degerin
        Kamyon classinda instance variable'a atanmasi..

        Ancak scope konusunda ogrendigimiz gibi
        Kamyon constructor scope'unda "marka" isimli bir variable oldugu icin
        instance markaya gitmiyor

        Bu karisikligi gidermek icin instance variable'lari
        belirli bir hale getirmemiz lazim

        Java bunun icin this keyword'u olusturmustur
        Genel kullanim acisindan this keywordu
        kodu herkesin anlamasini kolaylastirdigi icin tercih edilir
         */
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public  Kamyon(){

    }

    @Override
    public String toString() {
        return
                "\n marka : " + marka +
                "\n model : " + model +
                "\n yil : " + yil +
                "\n fiyat : " + fiyat;
    }
}
