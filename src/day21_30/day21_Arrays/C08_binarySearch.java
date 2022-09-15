package day21_30.day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Binary Search java'da eleman aramanin kisa yoludur
        Ancak binary search'un calismasi icin once array'in sirali hale getirilmesi gerekir
        Eger siralama yapmadan binarySearch yaparsaniz
        sonucu bulamayablir veya yanlis bulabilir
         */
        String[] harfler = {"Y","B","D","G","O","A"};
        String arananHarf = "Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));

        //binarSearch bize aradigimiz elamanin indexini dondurur
        //array sirali olmadigi icin arama sonucu hatali olabilir
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));
    }
}
