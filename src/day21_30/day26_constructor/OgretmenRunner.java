package day21_30.day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("Ogretmen-1 Bilgileri "+ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("Emre","AKDOGAN","02/11/1998","Matematik","Fizik");
        System.out.println("\nOgretmen-2 Bilgileri "+ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Cavidan","KABINKARA","21/06/1987");
        System.out.println("\nOgretmen-3 Bilgileri "+ogretmen3);




    }
}
