package day11_stringManipulations;

public class C05_startsWith_endsWith {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        System.out.println(str.startsWith(""));



        System.out.println(str.startsWith("c",5));

        System.out.println(str.startsWith("ok",6));

        System.out.println("el'le mi bitiyor? "+str.endsWith("el"));

        System.out.println("hiçlikle mi biter? "+ str.endsWith(""));


        /*
        SORU : kullanicidan bir mail alin
  - mail @ icermiyorsa “gecersiz mail”
  - mail @gmail.com icermiyorsa, “mail gmail olmali”
  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
 yazdirin.
         */






    }
}
