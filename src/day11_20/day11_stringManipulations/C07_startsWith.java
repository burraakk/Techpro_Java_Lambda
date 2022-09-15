package day11_20.day11_stringManipulations;

public class C07_startsWith {
    public static void main(String[] args) {

        String input = "Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J"));//true
        System.out.println(input.startsWith(""));//true
        System.out.println(input.startsWith("gun",5));//true   5.index ve sonrasina bakar
        System.out.println(input.startsWith("gun",6));//false
        System.out.println(input.startsWith("gun",4));//false
    }
}
