package day31_40.day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        marketteki tum urunleri bir arrayde tuttugumuzu varsayalim
        kullaniciya index sorup o indexteki urunu yazdiran bir program hazirla
        kullanici urun sayisindan buyuk bir index girerse
        exception vermesinin onune gecelim
         */

        String[] urunler = {"Nutella","Cokokrem","Sut","Cay","Findik"};

        int istenenSira = 0;
        boolean control = true;

        while(control) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Istediginiz urunun sira nosunu giriniz");
                istenenSira = scanner.nextInt();
                control = false;
            } catch (InputMismatchException armut) {
                System.out.println("Lutfen bir tam sayi giriniz!");
            }
        }

        /*
        catch blogunun onundeki parantezde
        exception class'inin ismi ve yaninda
        yakalanan exception'i atadigimiz variable'in ismi olur(e)

        eger yakalanan exception ile ilgili bilgileri
        kullaniciya vermek isterseniz bu objeyikullanabilirsiniz
        eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
        e kullanilmasa da kod calisir
         */
        try {
            System.out.println("Aradiginiz urun  : " + urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nSira numarasi en fazla " + urunler.length + " olabilir");
        }

    }
}
