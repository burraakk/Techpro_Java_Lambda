package practice.practice03;

import java.util.Scanner;

public class Q04_StringManipulastion {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime yaziniz : ");
        String kelime = scanner.nextLine();

        char ortancaKarakter = kelime.charAt((kelime.length()-1)/2);

        if (kelime.length()%2==1 && kelime.length()>=3){
            System.out.println("Ortanca karakter : " + ortancaKarakter);
        }

    }
}
