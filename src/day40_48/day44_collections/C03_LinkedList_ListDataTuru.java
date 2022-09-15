package day40_48.day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();

        List<String> ll2 = new LinkedList<>();

        Queue<String> ll3 = new LinkedList<>();

        Deque<String> ll4 = new LinkedList<>();


        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2);
        System.out.println(ll2.remove(3));
        System.out.println(ll2.remove("Enes"));
        System.out.println(ll2.remove("Kemal"));
        System.out.println(ll2);
        // eger Listemiz Integer elementlerden olusuyorsa
        // direk sayi yazarsak index olarak kabul eder
        // bir variable'a atama yapar ve remove'da o variabe'in ismini yazarsak obje olarak kabul eder
        System.out.println("bos mu? --->" + ll2.isEmpty());
        ll2.set(1,"Serap");
        System.out.println(ll2);

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println("ll1 : "+ll1);

        ll2.retainAll(ll1);   // ll2 deki tum elementleri ll1 ile karsilastirir
                              // ll1'de olmayanlari sileraa
        System.out.println("ll2 retainAll sonrasi : "+ll2);

        System.out.println(ll2.hashCode()); //2066939
        ll2.add("Fatih");
        System.out.println(ll2.hashCode()); //131726141

    }
}
