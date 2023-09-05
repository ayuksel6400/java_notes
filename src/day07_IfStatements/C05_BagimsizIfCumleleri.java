package day07_IfStatements;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // Kullanıcıdan bir ucgenin 3 kenar uzunlugunu al
        // ucgen eşkenar ise "eskenar ucgen" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kenar uzunlugunu girin:");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        /* Javada uclu karsılastırma olmaz.
         ikili karsilastirmalar yapip
         && veya || operatorleri ile birlestirmeli


         */


        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0){
            System.out.println("eskenar ucgen ");
        }




    }
}
