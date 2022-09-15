package day11_20.day17_NestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20'den 50'ye kadar(sınırlar dahil) cift sayilari yazdiralim


        //for loop ile

        int bas=20;
        int bitis=50;

        for (int i = bas; i <= bitis ; i++) {
            if (i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        int temp=bas;            //bas degiskeni bozulmasin diye gecici degisken atiyoruz
        while (temp<=bitis) {
            if (temp%2==0) {
                System.out.print(temp + " ");
            }
            temp++;
        }
    }
}
