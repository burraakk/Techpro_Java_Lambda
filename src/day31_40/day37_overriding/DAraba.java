package day31_40.day37_overriding;

public class DAraba {

    private void yakit(){
        System.out.println("Tum arabalar yakit kullanir");
        /*
        Child classlar parent classtaki method kullanamasin istiyorsak
        method'u private veya static yapariz
         */
    }


    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }

    void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }
}
