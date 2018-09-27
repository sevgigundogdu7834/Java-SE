package _05_nonaccess_modifier;

public class Notes {

    //final
    //abstract

    //bir sınıf final tanımlanırsa bu sınıfı kalıtamayız.(extends)

    //public final class String
}

final class Animal{


}

//class Dog extends Animal (make not final)

//____________________________________________________________________________________________________

//abstract(soyut) ,final keywordleri birbirine zıttır.
//Bir sınıfı abstract olarak tanımlıyorsak (içinde abstract methodlar olmasını bekleriz) ve amacı kalıtılmaktır.
//final sınıflar ise kalıtılmaya engel olunur.

//abstract sınıflardan nesne oluşturulamaz.

abstract class Person{

    abstract void getEngine();}


class People extends Person{


    @Override
    void getEngine() {

    }
}