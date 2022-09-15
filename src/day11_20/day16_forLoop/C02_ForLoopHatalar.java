package day11_20.day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        /*
        baslangic noktasindan sonra bitis sartina yaklasmiyorsak
         yani ending condition her zaman true veriyorsa
         sonsuz loop olusur
        */

        for (byte i = 0; i >-10; i++){        //calistirirsak sonsuz loop olusur..byte sinirina kadar
            System.out.print(i+"-");
        }

        /*
        eger ilk deger icin bile bitis sarti saglanmiyorsa
        for loop calisir, ama loop kirilir
        ve loop bodysi hic bir zaman devreye girmez(calismaz)
        */

        for (int i = 0; i>5; i++){
            System.out.println(i);
        }

    }
}
