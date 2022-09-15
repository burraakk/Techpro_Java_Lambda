package day11_20.day17_NestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
       /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.nextLine();
        int kontrol = 0;

        //ilk harf kontrolu
        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') {
            kontrol++;
        }else{
            System.out.println("Ilk harf buyuk olmali");
        }
        //son harf kontrolu
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') {
            kontrol++;
        }else{
            System.out.println("Son harf kucuk olmali");
        }
        //bosluk kontrolu
        if(sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else {
            kontrol++;
        }
        //sifre uzunlugu kontrolu
        if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("Sifre en az 8 karakter olmali");
        }

        if(kontrol==4){
            System.out.println("Sifre basari ile tamamlandi");
        }else {
            System.out.println("Islem basarisiz, lutfen yeni bir sifre giriniz");
        }

        */


        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;

        while (!sifreBasariliMi){
            //kullanicidan sifre alalim
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();

            //dort kontrolu yapalim, her gecen kontrol icin
            //ilk harf kontrolu
            if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') {
                kontrol++;
            }else{
                System.out.println("Ilk harf buyuk olmali");
            }
            //son harf kontrolu
            if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') {
                kontrol++;
            }else{
                System.out.println("Son harf kucuk olmali");
            }
            //bosluk kontrolu
            if(sifre.contains(" ")){
                System.out.println("Sifre bosluk icermemeli");
            }else {
                kontrol++;
            }
            //sifre uzunlugu kontrolu
            if (sifre.length()>=8){
                kontrol++;
            }else {
                System.out.println("Sifre en az 8 karakter olmali");
            }

            if (kontrol==4){   //tum kontrollerden gecti demektir
                System.out.println("Sifre basari ile tamamlandi");
                sifreBasariliMi = true;
            }else {  //sifre basarisiz demek
                        //tekrar basa donecek
                        //bu yuzden kontrol variable'i sifirlanmali
                kontrol=0;
            }
        }

    }
}
