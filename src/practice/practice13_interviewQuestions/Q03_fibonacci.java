package practice.practice13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_fibonacci {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34...
     */

    public static void main(String[] args) {

        List<Integer>fibonacciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList = " + fibonacciList);

        int i = 1;

        if (sayi <= 1) {
            System.out.println("Duzgun bi rakam gir olum");
        }else{
            while (fibonacciList.get(i) < sayi){
                fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i-1));
                i++;
            }
            System.out.println("fibonacciList = " + fibonacciList);
        }
        int sonIndextekiEleman = fibonacciList.size()-1;
        if (fibonacciList.get(sonIndextekiEleman) > sayi) {
            fibonacciList.remove(sonIndextekiEleman);
            System.out.println("girdigin sayi fibonacci dizisinde bulunmamaktadir = " +
                    "sizin girdiginiz sayiya kadar ki fibonmacci dizisi budur = "+fibonacciList);
        }else
            System.out.println("senin girdigin sayi fibonacci listinde var = " + fibonacciList);
    }
}
