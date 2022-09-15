package day21_30.day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1 = new Kamyon();
        System.out.println("Kamyon-1 Bilgileri "+kamyon1.toString());

        Kamyon kamyon2 = new Kamyon("Mercedes", "4140", 2005, 500000);
        System.out.println("\nKamyon-2 Bilgileri "+kamyon2);
        //toString() yazmasak da Kamyon classindaki toString()'i kullaniyor

        Kamyon kamyon3 = new Kamyon("MAN", "as900", 2007, 350000);
        System.out.println("\nKamyon-3 Bilgileri "+kamyon3);

        Kamyon kamyon4 = new Kamyon("Scania", "s540");
        System.out.println("\nKamyon-4 Bilgileri "+kamyon4);
    }
}
