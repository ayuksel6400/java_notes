package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan bir tam sayi isteyin
         Sayi 3' e bolunuyorsa 3'un kati
        sayi 5'e bolunuyorsa 5'in kati
        ikisine birden bolunuyorsa super sayi yazdirin
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bir tam sayi gir:");
        int sayi= scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5==0) {
            System.out.println("Super Sayi");
        }else if (sayi % 3 == 0) {
                        System.out.println("ûn kati");
        } else if (sayi % 5 == 0) {
            System.out.println("5in kati");
        }

        }

    }

