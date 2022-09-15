package day31_40.day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();

        //arb1 objesi uzerinden marka variable'ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)

        arb1.marka = "Toyota";
        System.out.println(arb1.marka);

        //access modifier kullanarak marka variable'ina ulasimi
        // tamamen serbest birakabilir veya tamamen engelleyebilirim
        //private yaptigimiz model'e ise hic ulasamayiz
        //yani access modifier ya hep ya hic diyor

        //modeli degistirelim ama goremeyelim
        //yakiti gorelim ama degistiremeyelim

        /*
        set ve get yetkilerini ozel olarak tanimlamak isterseniz
        1. adim : ozel yetki tanimlayacaginiz variable'lari private yapin
                  private bir dataya baska classtan ulasmak mumukun olmadigindan
        2. adim : set yetkisi icin setter, get yetkisi icin getter methodlarini olusturalim
         */

        arb1.setModel("Corolla");//model'e atama yaptik
        //ancak modeli yazdiramayiz, cunku getter methodu yok!!

        System.out.println(arb1.getYakit());//Elekttrikli bilgisini yazdirdik
        //yakiti degistiremeyiz cunku setter methodu yok!!


    }
}
