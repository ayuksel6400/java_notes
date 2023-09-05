package day07_IfStatements;

import java.util.Scanner;

public class c08_IfElseStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin uc kenarını gir:");
       double kenar1= scanner.nextInt();
        double kenar2= scanner.nextInt();
        double kenar3= scanner.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar2>0){
            System.out.println( "Ucgen eskenar");
                    } else {
            System.out.println("ucgen eskenar degil");
    }
}
}