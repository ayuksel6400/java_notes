package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan ay numarasini alip ay ismini yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediğiniz ay, kacinci ay:");
        int ayNo= scanner.nextInt();
        if (ayNo==1) System.out.println("Ocak");
        else if (ayNo==2) System.out.println("Şubat");
        else if (ayNo==3) System.out.println("Mart");
        else if (ayNo==4) System.out.println("Nisan");
        else if (ayNo==5) System.out.println("Mayıs");
        else if (ayNo==6) System.out.println("Haziran");
        else if (ayNo==7) System.out.println("Temmuz");
        else if (ayNo==8) System.out.println("Agustos");
        else if (ayNo==9) System.out.println("Eylul");
        else if (ayNo==10) System.out.println("Ekim");
        else if (ayNo==11) System.out.println("Kasim");
        else if (ayNo==12) System.out.println("Aralik");
        else System.out.println("Yanlış bir no girdiniz");

        }


    }

