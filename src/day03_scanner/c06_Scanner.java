package day03_scanner;

import java.util.Scanner;

public class c06_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen birinci sayi:");
        int birinciSayi= scanner.nextInt();
        System.out.println("Lutfen ikinci sayi:");
        int ikinciSayi= scanner.nextInt();
       int toplam=birinciSayi+ikinciSayi;
        ikinciSayi=(toplam-ikinciSayi);
        birinciSayi=(toplam-birinciSayi);

        System.out.println("birinci sayi artik:" + birinciSayi);
        System.out.println("ikinci sayi artik" + ikinciSayi);
    }
}
