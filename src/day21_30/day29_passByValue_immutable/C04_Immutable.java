package day21_30.day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable : degistirilemez
        mutable : degistirilebilir

        en meshur immutable class : String

         */

        String str = "Yildiz Bank";

        System.out.println(str.toUpperCase());  //YILDIZ BANK

        str.toLowerCase();

        System.out.println(str);  ///Yildiz Bank

        str.substring(3, 5);

        System.out.println(str);  //Yildiz Bank

        //Javada String gibi metin ifadelerde kullanabilecegimiz
        //mutable StringBuilder classi da vardir

        StringBuilder sb = new StringBuilder("Java Bank");

        System.out.println(sb);  //"Java Bank"

        sb.reverse();

        System.out.println(sb);  //knaB avaJ

        sb.append("...");

        System.out.println(sb);  //knaB avaJ...
    }
}
