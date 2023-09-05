package day07_IfStatements;

import java.util.Scanner;

public class fghgf {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        System.out.println("Saat kac?");
        int saat= scanner.nextInt();

        if (saat>=12 && saat <=18){
            System.out.println("iyi gunler");
        }

        if (saat>5 && saat <11){
            System.out.println("Gunaydin");
        }
        if (saat >18 && saat<22){
            System.out.println("İyi akşamlar");
        }
        if (saat >=22){
            System.out.println("iyi geceler");
        }
        }
}

