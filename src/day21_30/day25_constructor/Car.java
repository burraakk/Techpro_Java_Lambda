package day21_30.day25_constructor;

public class Car {
    /*
    Bu class bizim kaliphanemiz
    Bir araba olusturmak icin ihtiyacimiz olan variable ve methodlari
    bu class'ta belirleriz
    Sonra farkli classlarda araba olusturmamiz gerekirse
    bu classtan bir obje olusturup
    burada belirlenen variable vemethodlara gore araba uretiriz
     */
    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hiz yapar");
    }
}
