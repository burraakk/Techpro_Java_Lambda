package day31_40.day40_final;

public abstract class CAbstract {

    void toplama(){
        System.out.println("Bu method toplama yapar");
    }

    //void carpma();  abstract olmadigindan bu method body'siz olmaz

    abstract void carpma();

    abstract void bolme();

    //abstract void cikarma(){}   abstract method bu sekilde body kabul etmez!!!

    /*
    bir methodun basina abstract yazarsaniz
    bu methodun child classlar oldugunu deklare etmis olursunuz
    ve method body'sine ihtiyac kalmaz
     */

}
