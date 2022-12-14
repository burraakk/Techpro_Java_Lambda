package day31_40.day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IciceTryCatch {
    public static void main(String[] args) {

        int k;

        try {
            FileInputStream fis = new FileInputStream("src/day31_40.day39_exceptions/Test.txt");

            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosyadan bilgiler okunamadi");
        }

    }
}
