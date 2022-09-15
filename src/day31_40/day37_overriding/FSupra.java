package day31_40.day37_overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir");
    }


    /*
    Override notasyonu Javaya bir gorev verir
    Java bu notasyonla irbirine bagli olan iki methodu surekli kontrol eder
    Eger parent classtaki overriden methodu silerseniz notasyon CTE verir

    @Override notasyonu kullanmak mecburi degildir
    Eger overriding method silinirse, kodun CTE vermesinii istersek
    @Override notasyonu kullanmaliyiz
     */
    @Override //otomatik olusturunca @Override Notasyonunu kendiliginden ekliyor
    void motor() {
        System.out.println("Supra sirali 6 silindir motor kullanir");
    }
}
