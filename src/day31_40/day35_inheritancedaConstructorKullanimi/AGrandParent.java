package day31_40.day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";
    protected String grandParentKlupAdi = "Grandparent Klubu";

    /*
    her classda, gorulmese bile constructor vardir
    Bu classdan obje olusturmak istedigimizde
    default constructor devreye girecektir

    Default constructor'i gozlemleyemeyecegimiz icin
    onun yerine kullanilabilecek parametresiz constructor olusturalim
     */

    AGrandParent() {
        System.out.println("Grandpa constructor calisti");
    }


}
