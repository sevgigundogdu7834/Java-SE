package _05_assigment;

public class Notes {

    int number=10;    //literal assigment

    byte b1=10; //int tipinde
    //casting/narrow byte->int otomatik olarak yapılmaktadır.

    byte b2=(byte) 10;  //explicit

    public static void main(String[] args) {

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //BYTE -128 İLE 127 ARASINDA DEĞER ALIR.

        byte number1=10;
        byte number2=5;

        byte sum=(byte)(number1+number2);
        System.out.println("sum :" +sum);
    }
}
