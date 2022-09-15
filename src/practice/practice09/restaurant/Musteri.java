package practice.practice09.restaurant;

public class Musteri {
    public static void main(String[] args) {

        Mutfak menu = new Mutfak();

        System.out.println("Menu :"+menu.toString());

        Mutfak siparisim = new Mutfak("Adana Kebap","Mercimek","Kunefe","Salgam");

        System.out.println("\nSiparisim :" + siparisim);
    }
}
