package day11_20.day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        Bazen tek degisken soru cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
        bu tur durumlarda ic ice nested if kullanmak gerekir
         */

        for (int i = 1; i<=5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
