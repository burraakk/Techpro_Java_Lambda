package day21_30.day30_immmutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        //iki tarih arasindaki sureyi bulma

        LocalDate tarih1 = LocalDate.of(1992,3,24);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(tarih1,bugun);

        System.out.println(period);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
