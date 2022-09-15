package practice.practice04;

import java.util.Scanner;

public class Q02_MethodCreation {
    /*
   cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("metre ve km'ye donusturmek istediginiz cm degerini giriniz : ");
        double cmValue = scanner.nextDouble();

        convertCM(cmValue);
    }
    private static void convertCM(double cmValue) {
        double meter = cmValue / 100;
        double kMeter = cmValue / 100000;
        System.out.println("Girdiginiz cm degeri " + meter + " metre ve " + kMeter + " kilometredir.");
    }
}
