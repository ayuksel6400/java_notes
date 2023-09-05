package day07_IfStatements;

import java.util.Scanner;
import java.util.SortedMap;

public class c06_BagimsizIfCumleleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi gir:");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi % 3 ==0 || girilenSayi % 5 == 0){
            System.out.println("Guzel Sayi");

        }
    }
}
