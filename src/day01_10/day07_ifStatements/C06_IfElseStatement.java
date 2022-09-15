package day01_10.day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatement {

    public static void main(String[] args) {
        /*
        kullanicidan yasini iste
        eger 65ten büyükse "emekli olabilirsin" yazdir
        65ten kücükse emeklilige kac yil var yazdir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();


        if(yas<65){
            System.out.println("emekli olamazsin, "+(65-yas)+" yil daha calisman gerekiyor");
        }else {
            System.out.println("Emekli olabilirsin..");
        }
    }
}
