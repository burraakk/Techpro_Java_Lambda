package day21_30.day24_arraylists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {2,3,4,6,23,6,8,9,1};
        List<Integer> liste = new ArrayList<>();

        //arraydeki tum elemanlari inceleyelim
        //tek sayi olanlari list'e ataaayalim

        for (int each : arr) {
            if (each %2 == 1) {
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
