package day08_IfElseStatements;

import java.util.Scanner;

public class c03_IfElseIfStatements {
    public static void main(String[] args) {
        /*Ogrencinin notu 85 ve ustu ise AA,
        (85 ve ustu degilse) 65 ve ustu ise BB,
(65 ve ustu de degilse) 50 ve ustu ise CC,
(geriye kalanlar) DD

         */
        /*  *N*O*T*
        Bir if else if statement else ile bitmek zorunda değildir.
        ELSE İLE BİTEN kodlar her durum için bir sonuç üretirler.
        else ile bitmezse tüm durumları kapsamaz
        bazı değerler için sonuç üretmeyebilir.
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Notunuzu girin:");
        double not=scanner.nextDouble();

        if (not>=85) System.out.println("AA");
        else if (not>=65) System.out.println("BB");
        else if (not>=50) System.out.println("CC");
        else  System.out.println("DD");

    }
}
