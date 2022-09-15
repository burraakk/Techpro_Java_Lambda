package day31_40.day31_timeFormater_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        String isim1 = "Ercument";
        String isim2 = "Abdurrahman";

        enUzunKelimeyiYazdir("Ali","Ayse",isim2,"Ismail","Ahmet",isim1);
    }

    public static void enUzunKelimeyiYazdir(String... kelime) {

        String enUzunKelime = kelime[0];

        for (String each : kelime) {
            if (each.length() > enUzunKelime.length()){
                enUzunKelime = each;
            }
        }
        System.out.println("Girdiginiz kelimelerin en uzunu : "+enUzunKelime);
    }
}
