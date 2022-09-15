package day31_40.day33_encapsulation;

public class Araba {
    String marka = "Marka belirtilmedi";//marka'nin access modifier'i default acceess modifier oldugundan
                                        //package icinde kullanilabilir
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli"; //tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    //private yaptigimiz model ve yakit varianble'larina erisimi yetkilendirelim
    //modeli deger atanabilsin ama goremeyelim(setter)
    //yakiti gorelim ama deger atanamasin(getter)

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
