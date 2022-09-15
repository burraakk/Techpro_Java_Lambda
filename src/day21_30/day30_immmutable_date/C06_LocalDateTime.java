package day21_30.day30_immmutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat);

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));

        System.out.println(tarihSaat.minusDays(4).minusHours(50));

        System.out.println(tarihSaat.plusMonths(2).minusDays(15));

        System.out.println(tarihSaat.toLocalDate());

    }
}
