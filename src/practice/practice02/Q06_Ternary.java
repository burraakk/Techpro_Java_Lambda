package practice.practice02;

public class Q06_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {
        int fiyat = 10;

        String result = fiyat<10?"ucuz" : fiyat<20?"normal" : "pahali";
        System.out.println("result = " + result);

        System.out.println(fiyat<10?"ucuz" : fiyat<20?"normal" : "pahali");

       //if (fiyat<10){                         IF'LI COZUM
       //    System.out.println("ucuz");
       //} else if (fiyat<20) {
       //    System.out.println("normal");
       //}else System.out.println("pahali");
    }
}
