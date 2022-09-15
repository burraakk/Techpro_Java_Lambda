package day11_20.day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        // 1'den 5'e kadar(5 dahil) olan tam sayilari toplayalim

        int toplam=0;

        for (int i = 1; i<=5; i++) {
            toplam += i;
        }
        System.out.println("toplam = " + toplam);

        //10 dahil,20 dahil aradaki sayilari toplayin
        toplam=0;
        for (int i = 10; i<=20; i++) {
            toplam += i;
        }
        System.out.println("toplam = " + toplam);

        //30 dahil, 50 dahil aradaki cift sayilari toplayin

        //ilk yontem
        toplam=0;
        for (int i=30; i<=50; i+=2) {
            toplam += i;
        }
        System.out.println("toplam = " + toplam);

        //ikinci yontem
        toplam=0;
        for (int i=30; i<=50; i++){
            if (i%2 == 0) {
                toplam += i;
            }
        }
        System.out.println("toplam = " + toplam);
        
        //1500 dahil,1600 dahil aradaki 7'ye tam bolunen sayilari toplayin
        
        toplam = 0;
        for (int i=1500; i<=1600; i++){
            if (i%7 == 0) {
                toplam += i;
            }
        }
        System.out.println("toplam = " + toplam);


    }
}
