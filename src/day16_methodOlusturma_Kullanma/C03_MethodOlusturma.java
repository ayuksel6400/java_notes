package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {
/*
    Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
    input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen adinizi girin:");
    String isim = scan.next();
    System.out.println("Lutfen soyadinizi girin:");
    String soyisim = scan.next();


    System.out.println(isimDuzenle(isim, soyisim));

    String duzenliIsim = isimDuzenle(isim,soyisim);


}


    public static String isimDuzenle(String isim, String soyisim){

    isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
    soyisim = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

    String istenenFormattaIsimSoyisim = isim+" "+soyisim;

    return istenenFormattaIsimSoyisim;
}







}
