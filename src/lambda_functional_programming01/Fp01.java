package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
        /*
        1) Lambda (Functional Programming) Java 8 ile kullanilmaya baslanmistir
        2) Functional Programming'de nasil yapilacak uzerine degil
           "Ne yapilacak" (What to do) uzerine yogunlasilir
           Structured Programming "Nasil yapilacak" uzerine yogunlasir
        3) Functional Programming Arrays ve Collections ile kullanilir
        4) "entrySet() methodu ile Map, Set'e donusturulerek Functional Programming'de kullanilabilir

         */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
        listElemanlariniYazdirStructured(liste);
        System.out.println();

        //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        listElemanlariniYazdirFunctional(liste);
        System.out.println();

        //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
        ciftElemanlariYazdirStructured(liste);
        System.out.println();

        //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();

        //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        tekElemanlarinKareleriFunctional(liste);
        System.out.println();

        //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();

        //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
        tekrarsizCiftElemanlarinKareleriToplami(liste);

        //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
        tekrarsizCiftElemanlarinKupleriCarpimi(liste);

        //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

        // 1. Yol
        getMaxEleman01(liste);

        // 2. Yol
        getMaxEleman02(liste);

        //Ödev
        //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

        //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

        //1.Yol
        getYedidenBuyukCiftMin01(liste);

        //2.Yol
        getYedidenBuyukCiftMin02(liste);

        //3.Yol
        getYedidenBuyukCiftMin03(liste);

        //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

        getTersSiralamaTekrarsizElemanlarinYarisi(liste);


    }

    public static void listElemanlariniYazdirStructured(List<Integer> list) {

        for (Integer w : list) {
            System.out.print(w + " ");
        }

    }

    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t+" "));
        //stream() methodu collection'dan elementleri akisa dahil etmek icin ve methodlara ulasmak icin ulasir

    }

    public static void ciftElemanlariYazdirStructured(List<Integer> list){

        for (Integer w : list){
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));

    }

    public static void tekElemanlarinKareleriFunctional(List<Integer> list){

        list.stream().filter(t-> t%2==1).map(t-> t*t).forEach(t-> System.out.print(t + " "));
        //elemanlarin degerleri degisecekse map() methodu kullanilir


    }

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){

        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));

    }

    public static void tekrarsizCiftElemanlarinKareleriToplami(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t,u)-> t+u);
        System.out.println(toplam);
    }

    public static void tekrarsizCiftElemanlarinKupleriCarpimi(List<Integer> list){

        Integer carpim = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1, (t,u)-> t*u);
        System.out.println(carpim);

    }

    public static void getMaxEleman01(List<Integer> list){

        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u);
        System.out.println(max);

    }
    public static void getMaxEleman02(List<Integer> list){

        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)-> u);
        System.out.println(max);

    }

    public static void getYedidenBuyukCiftMin01(List<Integer> list){

        Integer min = list.
                stream().
                distinct().
                filter(t-> t%2==0).
                filter(t-> t>7).
                reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);

        System.out.println(min);

    }

    public static void getYedidenBuyukCiftMin02(List<Integer> list){

        Integer min = list.
                stream().
                distinct().
                filter(t-> t%2==0).
                filter(t-> t>7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t,u)-> u);
        System.out.println(min);

    }

    public static void getYedidenBuyukCiftMin03(List<Integer> list){

        Integer min = list.stream().filter(t-> t%2==0).filter(t-> t>7).sorted().findFirst().get();
        System.out.println(min);

    }

    public static void getTersSiralamaTekrarsizElemanlarinYarisi(List<Integer> list){

        List<Double> sonuc = list.
                stream().
                distinct().
                filter(t-> t>5).
                map(t-> t/2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.println(sonuc);

    }


}
