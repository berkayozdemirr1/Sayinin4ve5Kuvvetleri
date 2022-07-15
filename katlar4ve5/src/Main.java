import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sinir Sayisini Giriniz : ");
        sayi = girdi.nextInt();

        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println("4'un " + sayi + " sayisina kadar olan kuvvetleri : " + i);
        }
        System.out.println("-------------");

        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println("5'in " + sayi + " sayisina kadar olan kuvvetleri : " + i);
        }
    }
}