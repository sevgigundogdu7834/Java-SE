package _06_wrapper;

public class Example_03 {

    public static void main(String[] args) {

        int number=3;
        testMethod(number);
    }

    //minimalist bir yaklaşım tercih edilir.
    //int -> long minimalist
    //int-> Integer widening bir yaklaşımdır.

    public static void testMethod (long i){

        System.out.println("long variable");

    }

    public static void testMethod (Integer sayi){

        System.out.println("wrapper variable");
    }
}
