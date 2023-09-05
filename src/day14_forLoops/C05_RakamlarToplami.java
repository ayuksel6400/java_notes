package day14_forLoops;

import java.util.Scanner;

public class C05_RakamlarToplami {
    public static void main(String[] args) {

        /* Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz:");
        int girilensayi = scan.nextInt();

        int sayi = girilensayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        int basamakSayisi = (sayi + "").length();

        for (int i = 1; i <= basamakSayisi; i++) {

            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }
        System.out.println(rakamlarToplami);


    }


}

