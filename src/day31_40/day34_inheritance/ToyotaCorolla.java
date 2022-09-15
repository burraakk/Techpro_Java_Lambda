package day31_40.day34_inheritance;

public class ToyotaCorolla extends Toyota{

    public static void main(String[] args) {
        /*
        child class'tan parent class'a erisimde
        access modifier kurallarini bypass edemeyiz
        ornegin parent classtaki private class uyelerini chil classtan kullanamayiz
        ayni sekilde parent ve child farkli package'larda ise
        parent classtaki default access modifier'i olan
        class uyelerini child class'tan kullanamayiz
         */



        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka);


    }


}
