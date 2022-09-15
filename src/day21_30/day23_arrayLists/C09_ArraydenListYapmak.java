package day21_30.day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        List ile calisirken en kotu ozelligi
        elemanlari tek tek eklemek zorunda olmamizdir
         */

        Integer[] arr = {2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};
        /*
        bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine
        array olusturup, for loop ile olusturdugumuz list'e tasiyabiliriz
         */
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);// [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        Bu islemi yapmasi icin Java'nin olusturmus oldugu bir method da var
        Ancak bu yontemin cok yan etkisi var

        1- Bu sekilde olusturulan listede add, remove gibi
        size'i degistiren methodlar KULLANILAMAZ
        2- asList methodu ile olusturulan liste ve kaynak olan array
        birbiri ile ilisik olarak hayatlarina devam ederler
        Birinde yapilan degisiklik otomatik olarak digerine isler
         */
        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2);// [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar);

        //sayilar2.add(5);     UnsupportedOperationException hatasi verir
        //System.out.println(sayilar2);

        arr[0] = 20;
        System.out.println(Arrays.toString(arr));
        System.out.println("Array'de degisiklik yapinca sayilar2 : "+sayilar2);
    }
}
