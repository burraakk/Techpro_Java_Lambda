package day21_30.day30_immmutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();
        System.out.println("ilk time1 : "+time1);

        Thread.sleep(1000);

        /*
        bizim olusturdugumuz date ve time canli saat veya tarih degildir
        LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip
        bizim variable'imiza store eder
        time1 variable'inin degeri SABİTTİR
         */

        time1 = LocalTime.now();
        System.out.println("son time1 : "+time1);

        System.out.println("getSecond time1 : "+time1.getSecond());

        System.out.println("plusSeconds time1 : "+time1.plusSeconds(10000));

        System.out.println("minusMinutes time1 : "+time1.minusMinutes(35));

        System.out.println("withHour(3) time1 :"+time1.withHour(3));  // saati manuel 3 olarak yazdirdi


    }
}
