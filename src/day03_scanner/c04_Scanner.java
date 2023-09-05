package day03_scanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Dikdörtgenin iki  kenarını giriniz");
        double kenar_1= scanner.nextDouble();
        double kenar_2= scanner.nextDouble();
        System.out.println("Dikdortgenin alani" + kenar_1 * kenar_2);




    }
}
