package practice.practice07;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */

    public static void main(String[] args) {
        String cumle = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        cumle = cumle.replace(" ","");

        System.out.println("cumle.length() : "+cumle.length());

        String[] harf = cumle.split("");
        System.out.println("harf.length : "+harf.length);


        cumle = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String[] kelime = cumle.split(" ");
        int boslukSayisi = kelime.length-1;
        System.out.println("Bosluk sayisi : "+boslukSayisi);

        String[] character = cumle.split("");
        System.out.println("character sayisi : "+ (character.length-boslukSayisi));


    }
}
