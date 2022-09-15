package day11_20.day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //iki sayiyi carpip sonucu bize doduren bir method olusturun

        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);
    }
    public static int carpGetir(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

}
