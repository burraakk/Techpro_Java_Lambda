package day11_20.day18_while_doWhileLoop;

public class C05_DoWhileloop {
    public static void main(String[] args) {
        //9'dan 190'a kadar 7'nin kati olan tum tam sayilari yazdir
        int bas = 9;
        int son = 190;
        int temp = bas;

        while (temp < son) {
            if (temp%7==0) {
                System.out.print(temp+" ");
            }
            temp++;
        }
        System.out.println("");
        temp = bas;
        do {
            if (temp%7==0) {
                System.out.print(temp+" ");
            }
            temp++;
        }while (temp < son);



    }
}
