package day01_10.day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {
        int sayi1 = 23;
        int sayi2 = 5;

        System.out.println(sayi1/sayi2); //iki sayi da int oldugundan kusuratı yazmaz,sonucu int olarak dondurur..

        //bu data casting degil fakat bilinmesi gereken bi ozellik
        System.out.println(25*7/3);//58,6666...-->58  yani sonucu int verir

        double sayi3 = 5;
        System.out.println(sayi1/sayi3);//data turleri farkliysa daha kapsamli olani data turu kabul eder
    }
}
