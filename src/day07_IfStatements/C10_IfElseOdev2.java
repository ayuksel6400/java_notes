package day07_IfStatements;

import java.util.Scanner;

public class C10_IfElseOdev2 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
olarak yazdirin, yoksa girilen harfi yazdirin
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Kucuk ya da buyuk bir harf girin");
        char krk = scanner.next().charAt(0);

        if (krk >=65 && krk <=90 ){
            System.out.println("Girdigin harf kucuktu ben buyuttum:" + (Character.isDigit(krk)));
        }



    }
}
