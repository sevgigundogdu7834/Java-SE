package _02_Handling_Exception;

import java.util.concurrent.Callable;

public class Notes {

    static String name;
    //javada exception handling konusunda bazı keywordler vardır :
    //try,catch,throw,throws,finally()

    public static void main(String[] args) {


        try {

            int length=name.length(); //java.lang.NullPointerException;
            int x=10/0;               //java.lang.ArithmeticException;
            System.out.println("Try bloğu");

        } catch (Exception e) {

            System.out.println("Catch bloğu");
            System.out.println(e);

        }

    }

    }

