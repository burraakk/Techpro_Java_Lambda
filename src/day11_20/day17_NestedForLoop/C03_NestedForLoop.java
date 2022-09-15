package day11_20.day17_NestedForLoop;

public class C03_NestedForLoop {
    /*
    verilen en ve boy degerlerine gore
    *'lardan olusan bir dikdortgen olusturalim
    yukseklik:3   boy:4
    * * * *
    * * * *
    * * * *
     */

    public static void main(String[] args) {
        int yukseklik = 4;
        int boy = 8;

        for (int i = 1; i <= yukseklik; i++){
            for (int j = 1; j <= boy; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
