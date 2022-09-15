package day01_10.day10_stringManipulations;

public class C03_equals {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali CAN";
        String str3 = "Ali Can" + "";
        String str4 = "Ali Can";
        String str5 = new String("Ali Can");

        System.out.println(str1==str2);//false

        System.out.println(str1==str3);//true
        System.out.println(str1.equals(str3));//true

        System.out.println(str1==str5);//false
        System.out.println(str1.equals(str5));//true

        System.out.println(str1==str4);//true

        System.out.println(str3==str5);//false
        System.out.println(str3.equals(str5));//true

        /*
        Stringlerde ayni String olsa bile == her zaman calismaz
        Sonucun dogrulugundan emin olmak isterseniz equals() methodu kullanmalısınız

        equals() kullanirken true sonucunu almak için metinler birebir ayni olmalidir..
         */

    }
}
