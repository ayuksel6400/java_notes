package day13_StringManipulations_forLoop;

public class C04_ReplaceFirst {
    public static void main(String[] args) {

        String str = "Java Candir, kendisini cok seviyoruz123.";

        System.out.println(str.replaceFirst("a", "A"));

        System.out.println(str.replaceFirst(" ", "  "));

        System.out.println(str.replaceFirst("\\d"," "));

        System.out.println(str.replaceFirst("\\W", "*"));




    }
}
