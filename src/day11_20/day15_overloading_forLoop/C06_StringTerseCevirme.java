package day11_20.day15_overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {
        //input olarak verilen String'i terse cevirip yazdiran bir method olusturun

        String input = "Alex ne topcuydu be";

        terstenYazdir(input);
    }
    public static void terstenYazdir(String input) {
        String tersInput = input.substring(input.length() - 1);

        for (int i = input.length()-2; i>=0; i--) {
            tersInput += input.substring(i,i+1);
        }
        System.out.println(tersInput);


        String terstenInput = "";

        for (int i = input.length()-1; i>=0; i--) {
            terstenInput += input.substring(i,i+1);
        }
        System.out.println("ikincisi\n"+terstenInput);




    }
}
