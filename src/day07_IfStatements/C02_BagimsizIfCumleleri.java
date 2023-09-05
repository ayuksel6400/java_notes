package day07_IfStatements;

public class C02_BagimsizIfCumleleri {
    public static void main(String[] args) {
      /*
      Dikkat Edilecekler

      1- eger boolean sarttan sonra {} kullanilmazsa
      Java if body'si olarak ilk ; e kadar olan bolumu alır.
      digerleri if body'si dış-sında kalır.

      2- İf cumlesinde suslu parantez (curly brazes) kullanmaz
      ve boolean sartın sonuna ; koyarsanız if cumlesi hicbir islem yapmaz.
      cunku body'si yoktur.

      OZETLE
      İf body'si tek satirdan oluşuyorsa {} kullanmasan da olur
      ancak birden fazla satırdan oluşuyorsa mutlaka {} kullanmalısın.


       */

        int a= 35;
        int b = 30;

        if (a<b){
            System.out.println("a b'den kucuk 1");
            System.out.println("a b'den kucuk 2");
            System.out.println("a b'den kucuk 3");


        }

        if (a % 2 == 0);
        System.out.println("a 2 ile tam bolunuyor 1");
        System.out.println("a 2 ile tam bolunuyor 2");
        System.out.println("a 2 ile tam bolunuyor 3");
    }
}
