package practice.practice09.restaurant;

public class Mutfak {

    public String yemekler = "Adana Kebap, Urfa Ciger, Kusbasi, Kusleme";
    public String araSicaklar = "Yayla Corba, Mercimek, Dugun Corba, Corba ";
    public String tatlilar = "Baklava, Sutlac, Gullac, Kazandibi, Kunefe";
    public String icecekler = "Ayran, Salgam, Kola";

    public Mutfak() {
    }

    public Mutfak(String yemek, String araSicak, String tatli, String icecek) {
        this.yemekler = yemek;
        this.araSicaklar = araSicak;
        this.tatlilar = tatli;
        this.icecekler = icecek;
    }

    @Override
    public String toString() {
        return
                "\nyemekler = " + yemekler +
                "\naraSicaklar = " + araSicaklar +
                "\ntatlilar = " + tatlilar +
                "\nicecekler = " + icecekler;
    }
}
