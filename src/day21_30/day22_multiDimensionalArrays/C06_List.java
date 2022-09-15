package day21_30.day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array'i array yapan sembol [] idi
        arrayList'te ise <> (diamond) kullaniriz
         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler);

        //bir list'e eleman eklemek istersek
        isimler.add("Basak");
        System.out.println(isimler.add("Ayse")); // true dondurur (add methodu boolean deger dondurur)

        /*
        String'de bir method calistirdigimizda
        assign yapmazsak isim degismiyordu

        String isim = "Suleyman"
        isim.toUpperCase();  //sadece bu satir icin SULEYMAN olur
        sout(isim); ---> Suleyman
;       */

        System.out.println(isimler);

        /*
        List'in tek kotu tarafi array altyapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir
        */
    }
}
