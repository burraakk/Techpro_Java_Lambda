package practice.practice12_okulProje;

public class Kisi {
    //herkesin ortak ozellikleri
    private String adSoyad;
    private String kimlikNo;
    private int yas;

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;     //yas kontrolu yap burada
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "\n Ad-Soyad = " + adSoyad +
                "\n Kimlik No = " + kimlikNo +
                "\n Yas = " + yas;
    }
}
