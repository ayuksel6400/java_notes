package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin:");
        double sayi1= scanner.nextDouble();

        System.out.println( sayi1>0 ? sayi1 : -1*sayi1);
    }
}
