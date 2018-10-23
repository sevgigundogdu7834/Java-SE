package _02_operators;

public class Notes {

    //assigment operator -> (atama operatörü)
    //compound assigment operator -> (birleşik atama operatörü)

    //equality ve relational operatör
    // == != < > <= >=

    //instanceof IS-A önermesidir.

    public static void main(String[] args) {

        int number=5;
        number*=3+6;

        System.out.println(number);

       int number1=number* 3+6 ;//yanlış
        int number2=number*(3+6); //doğru

        System.out.println(number1);
        System.out.println(number2);

        int x=4;
        x-=2;

        System.out.println(x);

        //Boolean değişkenler için == kullanma. !!!!!!!!!!

    }
}
