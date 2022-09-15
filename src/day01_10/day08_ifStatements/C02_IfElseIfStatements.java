package day01_10.day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 üzerinden notunu isteyin.
        Not'u harf sistemine çevirip yazdırın.
        50'den kucukse "D",
        50(dahil)-60 arasi"C",
        60(dahil)-80 arası"B",
        80(dahil)'nin uzerinde ise "A"
        Gecersiz not girildiginde uyari ver
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100'e kadar bir not degeri giriniz..");
        double not = scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("Gecersiz bir not girdiniz!!");
        }else if (not<50) {      //bu satira geldiysek notumuz 0 ile 100 arasinda girildi demektir
            System.out.println("Notunuz : D");
        }else if (not<60) {   //bu satira geldiysek not 50 ile 100 arasi..bu yüzden "50<=not" diye belirtmeye gerek yok
            System.out.println("Notunuz : C");           //bu yüzden "50<=not" diye belirtmeye gerek yok
        }else if (not<80) {
            System.out.println("Notunuz : B");
        }else  {
            System.out.println("Notunuz : A");
        }


    }
}
