package day31_40.day39_exceptions;

public class C03_exceptions {
    public static void main(String[] args) {

        String str = "123a5";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir");
        }
        catch(Exception e){
            System.out.println("Ongorulemeyen bir hata olustu");
        }

        System.out.println("Sayinin karesi : " + sayi*sayi);

        /*
        Kullanicidan String olarak bir deger aliyor ve bunu Integer'a ceviriyorsak
        NumberFormatException ile karsilasabilecegimizi ongoruruz
        NumberFormatException aldigimizda kodun durmamasini istiyorsak
        try-catch ile cevreleyebiliriz

        eger bilmedigim bir exception daha olusursa
        kodum durmasin istiyorsam
        bir kere daha catch cumlesi ekleyip
        ona en genis exception'i yazabiliriz
         */
    }
}
