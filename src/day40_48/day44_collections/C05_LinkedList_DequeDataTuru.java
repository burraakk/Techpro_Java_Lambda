package day40_48.day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        System.out.println(ll4); //[Cavidan, Mesut, Selim, Tevfik, Selim]
        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4);  //[Cavidan, Mesut, Selim, Tevfik]
        System.out.println(ll4.pop()); //Cavidan
        System.out.println(ll4); // [Mesut, Selim, Tevfik]

        System.out.println(ll4.remove()); //  Mesut
        System.out.println(ll4); // [Selim, Tevfik]

        System.out.println(ll4.removeFirst()); // Selim
        System.out.println(ll4); // [Tevfik]

        System.out.println(ll4.removeLast()); // Tevfik
        System.out.println(ll4); // []

    }
}
