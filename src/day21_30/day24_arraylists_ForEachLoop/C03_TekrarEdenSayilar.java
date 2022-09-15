package day21_30.day24_arraylists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {
        // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.
        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5,9};

        Arrays.sort(arr);
        List<Integer> tekrarEdenler = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]==arr[i+1]  && !tekrarEdenler.contains(arr[i])) {
                System.out.print(arr[i]+" ");
                tekrarEdenler.add(arr[i]);
            }
        }
        System.out.println();
        System.out.println(tekrarEdenler);
    }
}
