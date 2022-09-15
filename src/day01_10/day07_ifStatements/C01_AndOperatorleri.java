package day01_10.day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a>0 && b<20 && c>=b);//true
        System.out.println(a<0 && b<20 && c>=b);//false// && kullandigimizda ilk false'u gördügünde
                                    //artik gerisine bakmaz..burada a<20 false oldugundan gerisine bakmaz


        System.out.println(a<0 & b<20 & c>=b);//false//  & operatoru kullaninca tum sartlari kontrol eder

    }
}
