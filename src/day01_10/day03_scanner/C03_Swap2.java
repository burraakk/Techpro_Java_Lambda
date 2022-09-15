package day01_10.day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        //C02'deki swap sorusunu bos kova kullanmadan yap

        int num1 = 5;
        int num2 = 100;
        System.out.println("ilk num1 = "+num1);
        System.out.println("ilk num2 = "+num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Son num1 = "+num1);
        System.out.println("Son num2 = "+num2);
    }
}
