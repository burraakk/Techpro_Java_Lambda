package day01_10.day10_stringManipulations;

public class C01_charAt {
    public static void main(String[] args) {

        String str = "Java ogrenmek ne guzel";

        System.out.println(str.charAt(0));//J (ilk harfi dondurur)

        System.out.println(str.toUpperCase().charAt(7));//R

        System.out.println(str.charAt(21));//l

        /*
        son harfi bulmak icin st'in uzunlugunun 1 eksigini index olarak gireriz
        eger index olarak uzunlugu veya daha bir sayiyi girersek Java exception verir

        charAt() kullandigimizda sonuc char olacagindan artik manipulation yapamayiz
        kullanacagimiz String methodlarını charAt() metodundan once kullanmaliyiz
        */

    }
}
