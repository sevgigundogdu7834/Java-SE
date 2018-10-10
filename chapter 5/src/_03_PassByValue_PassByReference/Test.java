package _03_PassByValue_PassByReference;

public class Test {

    public static void main(String[] args) {

        Person person=new Person("Sevgi",24);
        System.out.println(person.getName() + ": " +person.getAge());


        //metoda Person tipindeki reference değişkeni vermekteyiz.
        //reference değişken heapteki objenin adres bilgisini tutan bit yapısıdır.
        //burada objenin kopyalanması gibi bir durum söz konusu değildir.

        changeFields(person);

        System.out.println(person.getName() + ": " +person.getAge());

        changeFields2(person);
        System.out.println(person.getName() + ": " +person.getAge());
    }

    public static void changeFields(Person personFields){

        personFields.setName("Züleyha");
        personFields.setAge(24);
    }

    public static void changeFields2(Person personFields2){

        personFields2=null; //obje uçurulmaz aradaki bağlantı gider.!!!!!!!!!!!!!ÖNEMLİİİİİ.....
    }

}
