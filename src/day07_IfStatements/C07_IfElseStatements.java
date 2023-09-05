package day07_IfStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Notu gir:");
        double alinanNot= scanner.nextInt();

        if (alinanNot >= 50){
            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }
    }
}
