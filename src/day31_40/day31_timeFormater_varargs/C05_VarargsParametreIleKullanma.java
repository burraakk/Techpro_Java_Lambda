package day31_40.day31_timeFormater_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        String isim1 = "Ercument";
        String isim2 = "Abdurrahman";

        enUzunKelimeyiYazdir(5,"Ali","Ayse",isim2,"Ismail","Ahmet",isim1);
    }
    /*
    Varargs teorik olarak sonsuz sayida element alabilir
    Bir methodta parametre olarak varargs varsa
    sinirlarini bilebilmesi icin varargs son parametre olmalidir
    oncesinde farkli parametreler olabilir
    ancak varargs sonrasinda baska parametre OLAMAZ.

    bu kuraldan oturu bir methodta SADECE 1 TANE varargs olabilir
     */

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime = kelime[0];

        for (String each : kelime) {
            if (each.length() > enUzunKelime.length()){
                enUzunKelime = each;
            }
        }
        System.out.println("Girdiginiz kelimelerin en uzunu : "+enUzunKelime);
    }
}
