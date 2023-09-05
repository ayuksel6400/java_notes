package day07_IfStatements;

import java.util.Scanner;

public class C09_IfElseOdev {
    public static void main(String[] args) {

        /* çözüldü
        Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
olup olmadigini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kakrakter girin:");
        char krk = scanner.next().charAt(0);


            if (krk >= 65 && krk <= 90) {

            System.out.println("Girilen karakter buyuk harf");
            } else {
                System.out.println("Girilen karakter kucuk harf");
        }
    }
}