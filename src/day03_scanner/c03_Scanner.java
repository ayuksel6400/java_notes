package day03_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class c03_Scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Adiniz:");
        String girilenAd= scanner.nextLine();
        System.out.println("Soyadiniz");
        String girilenSoyad= scanner.nextLine();
        System.out.println("Yasiniz");
        Integer yasiniz = scanner.nextInt();

        System.out.println("Adiniz:"+ girilenAd);
        System.out.println("Soyadiniz:"+ girilenSoyad);
        System.out.println("Yasiniz:"+ yasiniz);
        System.out.println("Kaydiniz \nbasariyla \ntamamlanmistir.");
    }
}
