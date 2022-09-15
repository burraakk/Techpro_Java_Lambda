package day01_10.day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*
        verilen sayi1 ve sayi2 variablelarinin degerlerini degistiren(SWAP)
        bir program yaziniz
        */
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;        //sayi3 gecici kovamiz

        System.out.println("SWAPten once sayi1 : "+sayi1+"\nSWAPten once sayi2 : "+sayi2);

        sayi3 = sayi2;
        sayi2 = sayi1;
        sayi1 = sayi3;

        System.out.println("SWAPten sonra sayi1 : "+sayi1+"\nSWAPten sonra sayi2 : "+sayi2);



    }
}
