package day21_30.day26_constructor;

public class Ogrenci {
    String name = "Emily";
    int age = 20;

    Ogrenci(String name, int age) {
        this.name = name;
        this.age = 22;
    }

    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Oliver", 21);

        System.out.print(ogrenci1.name);

        System.out.print(", "+ogrenci1.age);
    }
}
