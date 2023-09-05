package day03_scanner;

import java.util.Scanner;

public class c05_Scanner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen cemberin yari capini yaziniz");
                double yaricap1 = scanner.nextDouble();
        System.out.println("cemberin cevresi:"+ 2 * 3.14 * yaricap1 );
        System.out.println("dairenin alani:"+ 3.14 * yaricap1 * yaricap1);

    }
}
