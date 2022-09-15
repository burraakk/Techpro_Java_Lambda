package practice.practice07;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {
    /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
    */
    public static void main(String[] args) {
        
        farkiniBul();
    }

    private static void farkiniBul() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array uzunlugunu giriniz : ");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++){
            System.out.println("Array'in "+(i+1)+". elemanini giriniz : ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("Arraydeki en buyuk ve enkucuk eleman arasindaki fark : "+(arr[uzunluk-1] - arr[0]));
    }
}
