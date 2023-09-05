package day07_IfStatements;

public class C01_BagimsizIfCumleleri {
    public static void main(String[] args) {
        /* Bağımsız if cümleleri isminden de anlaşılacağı üzere
        kodun gereği ile ilgilenmez.
        Sadece boolean şarta odaklanır.
        Şartın sonucu true ise if body çalışır.
        boolean şartın sonucu false ise
        if body'si devreye girmez.

        Yani
        birden fazla bağımsız if cümlesi olan bir kod çalıştığında
        kaç if body'sinin çalışacağı verilen değerlere bağlıdır.

        tüm if bodyleri çalışabilir.
        Bazıları çalışabilir
        ya da hiçbir if bodysi çalışmayabilir.
         */


        int a = -201;
        int b = 104;
        if (a>0){
            System.out.println("1- a sayisi pozitif");

        }
        if (a+b>100){
            System.out.println("2- sayilarin toplami 100'den buyuk");
        }

        if (b% 3 == 0){
            System.out.println("3- b 3 ile tam bolunen tamsayidir");
        }

        if (b<100){
            System.out.println("4- b 100'den kucuk bir tamsayidir");
        }
    }
}
