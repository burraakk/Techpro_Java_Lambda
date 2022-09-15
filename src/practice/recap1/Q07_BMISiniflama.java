package practice.recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {
        /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
        public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
            System.out.println("Boyunuzu cm olarak giriniz");
            double boy = scan.nextDouble()/100;
            System.out.println("Kiilonuzu kg olarak giriniz");
            double kilo = scan.nextDouble();

            double bmi = kilo / (boy*boy);

            if (bmi<=20){
                System.out.println("BMI endeksiniz : "+bmi+"...Oldukca zayifsiniz");
            } else if (bmi <=25) {
                System.out.println("BMI endeksiniz : "+bmi+"...Normal sinirlardasiniz");
            } else if (bmi <=30) {
                System.out.println("BMI endeksiniz : "+bmi+"...Sisman kategorisindesiniz");
            } else if (bmi>30) {
                System.out.println("BMI endeksiniz : "+bmi+"...Obez grubundasiniz");
            }

            String result = bmi<=20 ? "Oldukca zayifsiniz" : bmi<=25 ? "Normal sinirlardasiniz" :
                    bmi<=30 ? "Sisman kategorisindesiniz" : bmi>30 ? "Obez grubundasiniz" :"";
            System.out.println(result);

        }
}
