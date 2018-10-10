package _03_PassByValue_PassByReference;

public class Test1 {

    public static void main(String[] args) {

        int number=3;
        System.out.println(number);

        //kopya durumu söz konusudur.
        change(number);
        System.out.println(number);
    }

    public static void change(int numberChange){

        numberChange=numberChange+20;
        System.out.println(numberChange);
    }
}
