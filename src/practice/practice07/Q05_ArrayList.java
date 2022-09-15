package practice.practice07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
     */
    public static void main(String[] args) {
        List<String> databaseIsim = new ArrayList<>();
        databaseIsim.add("Enes");
        databaseIsim.add("Ismail");
        databaseIsim.add("Abdulbaki");
        databaseIsim.add("Emre");
        databaseIsim.add("Melisa");
        databaseIsim.add("Oguz");
        System.out.println(databaseIsim);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanmak istediginiz username'i giriniz : ");
        String username = scanner.nextLine().trim();

        boolean usernameVarMi = databaseIsim.contains(username);

        if (usernameVarMi) {
            System.out.println("BU kullanici adi zaten alinmis");
        }else
            System.out.println("Bu kullanici adini kullanabilirsiniz");

        if (usernameVarMi){
            int randomSayi = new Random().nextInt(100);
            username += randomSayi;
            System.out.println("Yeni kullanici adiniz : "+username);
            databaseIsim.add(username);
        }else {
            System.out.println("Yeni kullanici adiniz : " + username);
            databaseIsim.add(username);
        }
        System.out.println("databaseIsim son hali : "+databaseIsim);
    }
}
