package day16_methodOlusturma_Kullanma;

public class C04_BaskaClassdanMethodKullanimi {
    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Method",1,3);

        System.out.println(C03_MethodOlusturma.isimDuzenle("bugra", "can"));

        String isimDuzenli = C03_MethodOlusturma.isimDuzenle("Mehmet","kemal");

        System.out.println(isimDuzenli.length());

    }
}
