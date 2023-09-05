package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        /*
        Bir sayı iste
        Sayı 3e bolunurse 3 un katı
        Sayı 5e bolunurse 5'in katı
        ikisine birden bolunurse super sayı
        ikisine de bolunmuyorsa yaramaz sayı yazdırın

         */
    Scanner scanner=new Scanner(System.in);
        System.out.println("Tamsayi gir:");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi %3 ==0 && girilenSayi %5 ==0) System.out.println("super sayı");
        else if (girilenSayi %3 ==0) System.out.println("3un katı");
        else if (girilenSayi %5 ==0) System.out.println("5in katı");
        else  System.out.println("yaramaz sayı");




    }
}
