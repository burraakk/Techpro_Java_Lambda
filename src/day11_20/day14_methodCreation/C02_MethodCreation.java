package day11_20.day14_methodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
    //Verilen 3 basamakli bir sayinin rakamlari toplamini yazdiran bir method olusturalim

    int input = 761;

    rakamlariTopla(input);
    }
    public static void rakamlariTopla(int input) {
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int temp = input;

        birlerBasamagi = input%10;
        rakamlarToplami+=birlerBasamagi;
        input /= 10;

        birlerBasamagi = input%10;
        rakamlarToplami+=birlerBasamagi;
        input /= 10;

        birlerBasamagi = input%10;
        rakamlarToplami+=birlerBasamagi;
        input /= 10;

        System.out.println("Girdiginiz "+temp+" sayisinin rakamlari toplami : "+rakamlarToplami);




    }


}





