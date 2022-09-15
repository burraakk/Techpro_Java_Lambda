package day11_20.day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan tam sayilar alin
        cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girince islemi bitirin
         */
        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        //while ile yapalim
        /*
        Looplarda kullanacagimiz variable'lari loop'tan once olusturmaliyiz
        while loop'da, loop'dan once olusturdugumuz bu variable'a
        atayacagimiz degeri iyi dusunmemiz gerekir
         */

        while(sayi%2==0){
            System.out.print("Bir sayi giriniz : ");
            sayi = scan.nextInt();
          if (sayi%2==0){
              System.out.println("Girilen sayi cift : "+sayi);
          }else System.out.println("Girilen sayi tek..");
        }

        //do while ile yapalim
        //do while loop'da onceden olusturulan variable'a hangi deger atandiginin
        //hicbir onemi yok, kod her durumda calisir
        /*
        do while dezavantaji:
        ilk calistirma kontrol yapilmadan gerceklestigi icin
        loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */
        do {
            System.out.print("Bir sayi giriniz : ");
            sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
            }else System.out.println("Girilen sayi tek..");
        }while(sayi%2==0);
    }
}
