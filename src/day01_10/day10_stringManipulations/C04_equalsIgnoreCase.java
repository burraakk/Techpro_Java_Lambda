package day01_10.day10_stringManipulations;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Arda Can";
        String str2 = "arda can";
        String str3 = "ARDA CAN";
        String str4 = "Arda Can_";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true

        System.out.println(str2.equals(str3));//false
        System.out.println(str2.equalsIgnoreCase(str3));//true

        System.out.println(str1.equals(str4));//false
        System.out.println(str1.equalsIgnoreCase(str4));//false
    }
}
