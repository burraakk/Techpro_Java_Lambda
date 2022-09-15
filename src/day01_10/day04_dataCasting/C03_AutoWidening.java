package day01_10.day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {
        /*
        auto widening dar veri turundeki degeri genis veri turune
        otomatik assign eder
         */

        byte sayi1 = 23;
        short sayi2 =55;

        int sayi3 = sayi1+sayi2;  //88

        double sayi4 = sayi1*sayi2; //1265.0    byte ve short isleme girdi,sonuc double cikti

        sayi4 = sayi2/sayi1;  //2.0  ONCE ISLEM!!
                           //sonuc 2.391 olmasina ragmen once islem yapar
                        //kusurat hesaba katilmadigindan sonuc 2 cikar
                    //bu 2 double olunca 2.0'a doner
        System.out.println(sayi4);
        sayi4 = (double)sayi2/sayi1;  //  53.0/23=2.391
        //sadece bir sayiyi double yapiyoruz!!dar veri genis veriye ayak uydurur
        //(double)(sayi2/sayi1) yapsak parantez ici 2'ye esit olacagindan sonuc yine 2.0 olurdu
        System.out.println(sayi4);


    }
}
