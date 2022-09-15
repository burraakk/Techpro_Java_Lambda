package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public abstract class MX3Dizel extends LX3{

    /*
       Bir abstract class
       concrete bir class'i parent edinebilir
     */

    public static void main(String[] args) {

        HA160 arb1 = new HA160();
        //concrete bir classtan istedigimiz objeyi olusturabiliriz

        FMercedes arb2 = new FMercedes();
        //mercedes de concrete

        // EToyota arb3 = new EToyota();  --->  EToyota' is abstract; cannot be instantiated
        //Absttract classlar constructor barindirir fakat obje URETEMEZLER
        //EToyota classi abstract oldugu icin obje uretemez!

        EToyota arb4 = new GCorolla();  //EToyota abstract oldugundan GCorolla'dan yardim aldik

        /*
         Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
        Data turunu istedigimiz abstract class
        constructor'i ise child'i olan concrete bir class'dan seceriz
         */

        // List<String> list1 = new List<String>();   ---> List interface oldugundan obje uretilemez
        List<String> list2 = new ArrayList<String>();   // ArrayList sinifindan yardim alarak olustururuz


    }

}
