package day01_10.day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //kullanicidan sayi al..pozitifse "pozitif",negatifse sayinin karesini yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        //eger ternary icindeki sonuclar farkli data turlerindeyse atama yapamayiz,sadece yazdirabiliriz

        System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));

    }
}
