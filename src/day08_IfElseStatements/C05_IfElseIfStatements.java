package day08_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        (kilo*10000 / (boy *boy)) vucut kitle endeksi
        30’dan buyukse obez, 25-30 arasi ise kilolu,
        20-25 arasi ise normal, 20’den kucukse zayif yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu kilogram olarak girin");
        double kilo = scanner.nextDouble();
        System.out.println("Boyunuzu cm olarak girin");
        double boy = scanner.nextDouble();

        double endeks = (kilo * 10000 / (boy * boy));

        if (endeks > 30) System.out.println(endeks + "ile"+"Obezsin");
        else if (endeks <= 30 && endeks >= 25) System.out.println(endeks + " ile" + "Kilolusun");
        else if (endeks < 25 && endeks >= 20) System.out.println(endeks + "ile " + "Normalsin");
     else {
            System.out.println(endeks +"ile "+ "Zayıfsın");}
        }



    }

