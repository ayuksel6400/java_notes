package day07_IfStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz:");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi % 5 ==0) {

            System.out.println("Sayı 5'in tam kati");
        }

    }
}
