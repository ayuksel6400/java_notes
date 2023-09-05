package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan pozitif bir tamsayi alin
        // sayının tek mi çift mi olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz:");
        int sayi= scanner.nextInt();
        if (sayi %2==0){
            System.out.println("Çift sayi");

        }else {
            System.out.println("Tek sayi");
        }

        /* If else ile yapabileceğimiz basit işlemleri
        daha kısa olarak yazabilmek için
        TERNARY kullanılır.
         */

        System.out.println(sayi%2==0 ?"Cift sayi": "Tek sayi");




    }
}
