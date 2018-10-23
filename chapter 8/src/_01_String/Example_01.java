package _01_String;

public class Example_01 {

    public static void main(String[] args) {

        String s1=" Spring ";
        String s2=" Summer";

        s1.concat(" Winter ");
        s2.toUpperCase();

        s1 +="Winter ";
        s2=s1.concat(s2);

        System.out.println(s2);
    }
}
