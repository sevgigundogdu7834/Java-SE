package _02_overloaded;

public class Test {

    public static void main(String[] args) {

        Test testObject=new Test();

        short s=10;
        testObject.testMethod(s);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);


        System.out.println(testObject.testMethod((short)320000));



    }

    public short testMethod(short s){


        return s;
    }
}
