package day17_methodOlusturma_methodOverloading;

import day16_methodOlusturma_Kullanma.C01_MethodOlusturma;
import day16_methodOlusturma_Kullanma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethodKullanma {

    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Method budur", 7,8);
        C03_MethodOlusturma.isimDuzenle("omer", "GOK");

        System.out.println(C01_AsalSayiBulma.asalSayiMi(59));
        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(12));
    }
}
