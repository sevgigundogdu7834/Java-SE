package _10_mixed;

public class TestTest {

    public static void main(String[] args) {

        int number=23;
        Test test=new Test("Giriş_Test");

        System.out.println(test.getTestName());
        System.out.println(test);

        System.out.println(" ");
        System.out.println(number);
        changePassByValue(number);
        System.out.println(number);


        System.out.println(" ");
        changePassByReference(test);
        System.out.println(test.getTestName());



    }

    public static void changePassByValue(int sayi){

       sayi=sayi+10;
        System.out.println(sayi);

    }

    public static void changePassByReference(Test testReference){

        testReference.setTestName("Reference_Test");
        Test test1=new Test("Reference222_Test");
        System.out.println(test1.getTestName());
        System.out.println(test1);



    }
}
