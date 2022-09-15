package practice.practice04;

public class Q05_ForLoop {
    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
    public static void main(String[] args) {
        System.out.println("--------------FOR ILE--------------");

        for (int i = 0; i <= 255 ; i++) {
            char ch = (char) i;
            System.out.println(i+" -> "+ch);
        }

        System.out.println("--------------WHILE ILE--------------");

        int i = 0;
        while (i <= 255) {
            char ch = (char) i;
            System.out.println(i+" - "+ch);
            i++;
        }

        System.out.println("--------------DO-WHILE ILE--------------");

        int j = 0;
        do {
            char ch = (char) j;
            System.out.println(j+" = "+ch);
            j++;
        }while (j <= 255);

    }
}
