package _06_wrapper;

public class Example_02 {

    public static void main(String[] args) {

        Integer sayi=100;
        Integer sayi2=100;

        System.out.println(sayi==sayi2);

        Integer sayi_1=1000;
        Integer sayi_2=1000;
        System.out.println(sayi==sayi2);

        Integer number=new Integer(100);
        Integer number2=new Integer(100);

        //new anahtar kelimesiyle oluşturduğumuzda değerden bağımsız olarak yeni bir obje oluşur.
        System.out.println(number==number2);   //false
        System.out.println(number.equals(number2)); //true;


    }

    //Wrapper Stringler için == yerine equals kullan.
}
