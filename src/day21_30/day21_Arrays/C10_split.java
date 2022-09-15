package day21_30.day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        //split() methodu bir array methodu degi l bir String methodudur
        //ama array dondurdugunden burada anlatiyoruz

        String str = "Java ne kadar guzel";

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String[] kelimelerNe = str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));

        String[] kelimelerE = str.split("e");
        System.out.println(Arrays.toString(kelimelerE));

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
    }
}
