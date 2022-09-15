package day01_10.day10_stringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));// 5
        System.out.println(str.indexOf('g'));// 6
        System.out.println(str.indexOf("t"));/* -1
                                            indexOf() metodu integer deger dondurur
                                            int'de yok diye bir deger bulunmuyor
                                            olmayan karaktere 0 diyemeyiz cunku index 0'da J harfi var
                                            bu yuzden Java olmayan karakter icin -1 dondurmeyi tercih etmistir
                                            */

        String str5 = "egdmkbozdj4t04y9kaeokgpeawgehhdhg,dige4rh";

        if(str5.indexOf("?")==-1){
            System.out.println("Str5'te istenen karakter kullanilmamis");
        }else {
            System.out.println("str5'te istenen karakter kullanilmis");
        }


    }
}
