package day01_10.day07_ifStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Bir If statement'da {} kullanilmazsa
        java ilk satiri if ile baglar,
        sonraki satirlar bagimsiz olur
         */

        int sayi = -10 ;

        if (sayi > 0)
            System.out.println("sayi poitif");//if'e bagli
            System.out.println("pozitif kalacak");//if'e bagli degil..sart saglanmasa da calisir
            System.out.println("bu satir da benden");//if'e bagli degil..sart saglanmasa da calisir

        if (sayi % 2 == 0)
            System.out.println("sayi cift");//if'e bagli
            System.out.println("cift kalacak");//if'e bagli degil..sart saglanmasa da calisir


        if (sayi % 5 == 0)
            System.out.println("sayi 5in tam kati");//if'e bagli


    }
}
