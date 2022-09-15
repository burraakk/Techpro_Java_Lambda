package practice.practice01;

public class Q04_JavaVariables {

    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme
        int yas = 33;
        double boy = 1.70;
        System.out.println("yas :" + yas);
        System.out.println("boy :" + boy);

        // To copy the variable's value
        int burakYas = 30;
        int aliYas = burakYas;
        System.out.println("burakYas = " + burakYas);
        System.out.println("aliYas = " + aliYas);


        // you can declare multiple variables in the same line

        int gun = 24, ay = 11, yil = 2015;
        System.out.println("gun = " + gun);
        System.out.println("ay = " + ay);
        System.out.println("yil = " + yil);

        // updating a variable
        yil = 2018;
        System.out.println("Yeni yil : "+yil);


        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin
        
        char x;                                  //declaration
        double y = 45.123;                       //initialize-asssignment
        System.out.println("y = " + y);
        x = 'a';                                //initialize-assignment
        y = 12.2;                               //update
        System.out.println("x = " + x);
        System.out.println("yeni y = " + y);
    }

}
