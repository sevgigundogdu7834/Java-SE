package _01_Garbage_Collector;

public class Test_Person2 {

    public static void main(String[] args) {

        Person person1=new Person("Züleyha","Kaya");
        Person person2=new Person("Ayten","Gündoğdu");

        System.out.println(person1);
        System.out.println(person2);

        person1=person2; //person1 artık person2 nin gösterdiği yeri gösterir.

        System.out.println(" ");
        System.out.println(person1);
        System.out.println(person2);

        //artık person1 referans değişkeni de person2 nin referans değişkenin gösterdiği objeyi göstermekte.
        //bu durumda 1.obje sahipsiz kaldı.
        //böylece 1. obje temizlenmeye uygun hale geldi.

        System.gc(); //Garbage Collector bu şekilde çalışır.

        //finalize();
    }

}
