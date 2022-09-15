package day31_40.day37_overriding;

public class EToyota extends DAraba{

    @Override
    void marka() {
        /*super.marka();
        Eger hem overriden hem de overriding method'un calismasini istiyorsak
        ilk satira super.marka(); yazabiliriz
         */
    }

    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir ");
    }
}
