package day11_20.day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str = "1Bu2gu3n Ja*va- cok g3uz/el";
        //str'ı Bugun java cok guzel yap

        /*
        tum ozle karakterleri sil deyince spaceler de silinir
        spaceleri korumak icin en basta onlarin yerine cumlede bulunmayacak
        bir string koyali
         */

        str = str.replace(" ","qazwsx");
        System.out.println(str);
        str = str.replaceAll("\\W","");
        System.out.println(str);
        str = str.replaceAll("\\d","");
        System.out.println(str);
        str = str.replace("qazwsx"," ");
        System.out.println(str);

        System.out.println(str.replaceAll("\\w","*"));

    }
}
