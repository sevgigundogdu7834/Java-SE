package _02_varargs;

public class ExampleVarArgs {

    public static void testVarArg(int sayi){


    }

    public static void testVarArg2(int ... number){


    }

    //int... =array
   // String [] args -> String ... args iki türlü de çalışır.

    public static void main(String... args) {

        testVarArg(3);
       // testVarArg(3,4);

        testVarArg2(1);
        testVarArg2(1);
        testVarArg2(3,4,5,6);

        //var-arg yapısı ile 0-N adet argümanı methoda gönderebiliriz.
        //var arg yapısı en sonda yer almalıdır

    }
}
