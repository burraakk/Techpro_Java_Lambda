package practice.recap2;

import java.util.Scanner;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir gun giriniz");
        String gun = scanner.nextLine();
        gun = gun.substring(0, 1).toUpperCase() + gun.substring(1).toLowerCase();

        System.out.println(gun);

        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("Java Dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("SQL Dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum Dersi");
                break;
            case "Pazar":
                System.out.println("Izin gunu");
            default:
                System.out.println("Yanlis giris yaptiniz..");
        }
    }
}
