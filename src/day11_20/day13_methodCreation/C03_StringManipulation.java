package day11_20.day13_methodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {
         /*
        String methodlarini kullanrak
        "Java ogrenmek123 cok guzel@ " ifadesini
        "Java ogrEnmEk Cok guzEl" yazdirin
        */
        String cumle = "Java ogrenmek123 cok guzel@ ";

        cumle = cumle.trim();
        cumle = cumle.replaceAll("\\d","");
        cumle = cumle.replace("@","");
        cumle = cumle.replace("e","E");
        cumle = cumle.replace("c","C");

        System.out.println(cumle);

    }
}
