package _02_static;

public class Counter {

    static int number=0;

    //static değişkenlerin sadece bir kopyası vardır.
    //class variable adı verilmektedir.
    //Bu değişkenler sınıfa aittir.

    Counter(){

        number++;
    }


    public static void main(String[] args) {

        new Counter();
        new Counter();
        new Counter();

        System.out.println(number);
    }
}
