package day11_20.day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {
        /*
            Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum
        cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak
        yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
        yazdirin.
         */

        String cumle = "Java buyuk, dunya kucuk";
        /*
        requirements'ta buyuk kucuk harf hassasiyeti hakkinda birsey söylenmemis
        her iki kelimeyi icerme durumu aciklanmamis
        bu durumda gorevi bize kim verdiyse ona sormak lazım

        ek requirements :
        ikisi de varsa "karar ver buyuk mu yazdirayim, kucuk mu?"
        cxase sensitive olmasin
        */
        cumle = cumle.toLowerCase();

        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu?");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("Cumle kucuk ya da buyuk icermiyor");
        }
    }
}

