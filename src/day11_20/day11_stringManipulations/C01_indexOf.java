package day11_20.day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";
        /*
        Verilen bir string'de herhangir bir string veya char'ın
        ilk kullanildigi indexi bize dondurur
         */
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r"));//7
        System.out.println(str.indexOf("j"));//-1

        System.out.println(str.indexOf("mek"));//10

        /*
        eger istedig,m,z indexten sonrasını kontrol etmek istersek o zaman aynı
        meteodu 2 parametreli olarak kullanabiliriz
        */

        System.out.println(str.indexOf("g",6));//6    Yazilan indexten baslar
        System.out.println(str.indexOf("g",6+1));//18

        //Yukarıdaki str'da 2. ve 3. e'nin indexlerini bul
        //2. e için 1. e'ye ihtiyac var

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e",ilke+1);

        //eger 2. e varsa 3. e'nin olup olmadıgını
        //ve  varsa indexini yazdir

        if (ikincie == -1){
            System.out.println("Verilen str'da 2. e yok");
        }else {
            int ucuncue = str.indexOf("e",ikincie+1);
            if (ucuncue == -1) {
                System.out.println("Verilen str'da 3. e yok");
            }else {
                System.out.println("Verilen str'daki 3. e'nin indexi : "+ucuncue);
            }
        }


    }
}
