package day11_20.day12_stringManipulations;


public class C01_replace {
    public static void main(String[] args) {

        String str = " Bu gun ha va cok gu zel ";
        System.out.println(str.replace(" ",""));


        //hava yerine Java
        System.out.println(str.replace(" ","").replace("h","J"));

        //guzel yerine harika
        System.out.println(str.replace("gu zel","harika"));

        //cumleyi BUgun Java cok guzel yapalim

        str = str.replace("Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("gu zel","guzel");
        System.out.println(str);

    }
}
