package day07_IfStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz:");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0) {
            System.out.println("Girilen sayı 3'e bolunebilir");
        }
        if (girilenSayi % 5 == 0) {
            System.out.println("Girilen sayı 5'e bölünebilir");
        }

    }
}
