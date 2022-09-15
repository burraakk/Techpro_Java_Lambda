package day21_30.day30_immmutable_date;

import java.time.LocalDate;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih);

        System.out.println("getDayOfYear : "+tarih.getDayOfYear());
        System.out.println("getDayOfWeek : "+tarih.getDayOfWeek());
        System.out.println("getYear : "+tarih.getYear());
        System.out.println("getMonth : "+tarih.getMonth());
        System.out.println("getMonthValue : "+tarih.getMonthValue());
        System.out.println("getEra : "+tarih.getEra());
        System.out.println("getChronology : "+tarih.getChronology());
        System.out.println("isLeapYear : "+tarih.isLeapYear());

        System.out.println(tarih.plusDays(100));
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));
        System.out.println(tarih.minusWeeks(20));
        System.out.println(tarih.minusDays(100).minusMonths(5));

        LocalDate tarih2 = LocalDate.of(1992, 3, 24);
        System.out.println(tarih2.getDayOfWeek());
        System.out.println((LocalDate.of(1992, 11,24).getDayOfWeek()));

        LocalDate tarih3 = LocalDate.of(1992, 3, 15);


        System.out.println(tarih.isAfter(tarih2));

        //  iki farkli dogum gunu girildiginde hangisinde doganin
        //  daha buyuk oldugunu bulunuz

        if(tarih2.isAfter(tarih3)){
            System.out.println(tarih3+" tarihinde dogan daha buyuk.");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2+" tarihinde dogan daha buyuk.");
        } else
            System.out.println("Ayni gun dogmuslar");


    }
}
