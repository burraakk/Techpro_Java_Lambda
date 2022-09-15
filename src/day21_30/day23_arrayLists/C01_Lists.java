package day21_30.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println(sayilar1);
        System.out.println("Listenin boyutu : "+sayilar1.size());

        sayilar1.add(7);
        sayilar1.addAll(sayilar1);

        System.out.println(sayilar1);
        System.out.println("Listenin boyutu : "+sayilar1.size());

        sayilar1.set(2,8);
        System.out.println(sayilar1);

        System.out.println(sayilar1.set(0,12)); //sout icinde atama yaparsak SİLİNEN indexi verir
        System.out.println(sayilar1);
        /*
        set methodu istenen index'teki eski elementi silip
        yerine verdigimiz yeni elementi set eder

        eger eski elementi silmek istemiyorsak
        add(index,deger) methodunu kullanabiliriz

        set() methodu sildigi eski elementi bize dondurur
         */
    }
}
