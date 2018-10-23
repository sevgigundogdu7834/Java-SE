package _02_Handling_Exception;

public class TryCatch_ {

    public static void main(String[] args) {

        try {

            method1();

        } catch (Exception e) {

            System.out.println("catch bloğu....");
        }

    }

    public static void method1(){

        method2();
    }

    public static void method2(){

        method3();
    }

    public static void method3(){

        int divided=10/0;
    }
}
