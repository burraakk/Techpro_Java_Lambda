package day11_20.day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle = "Java cok kolay, Java cok guzel";
        String kelime = "Java";

        /*
        Verilen kelimen icin asagidaki sartlartdan uygun olanini yazdiran bir program yaziniz
        - verilen kelime cumlede hiç kullanilmamis
        - verilen kelime cumlede bir kez kullanilmis
        - verilen kelime cumlede birden fazla kullanilmis
         */

        int kelimeILkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeILkIndex==-1){
            System.out.println("Verilen kelime cumlede hiç kullanilmamis...");
        } else if (kelimeILkIndex==kelimeSonIndex) {
            System.out.println("Verilen kelime cumlede bir kez kullanilmis...");
        }else {
            System.out.println("Verilen kelime cumlede birden fazla kullanilmis...");
        }

    }
}
