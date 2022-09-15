package day11_20.day13_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen 2 integer'i toplayip sonucunu yazdiran bir method olusutur

        int input1 = 10;
        int input2 = 20;

        //method 4 adimda olusur
        //1. adim method call
        //2. adim argument eklenmesi gerekiyorsa ekleyelim
        //eger method'un return type'i voidden farkli olacaksa
        //bir cariable olusturup, method call'u assign edelim


        topla(input1,input2);
    }
    public static void topla(int input1, int input2) {
        //3.adim method deklarasyonunda degistirilmesi gereken
        // bolumleri degisitir(access modifier, return type vs..)
        //4.adim eger return type void disinda birseyse
        //return keywor'u, method call 'u assign edelim

        System.out.println("Girilen 2 sayinin toplami : "+(input1+input2));
    }
}
