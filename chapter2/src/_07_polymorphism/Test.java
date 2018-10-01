package _07_polymorphism;

class Animal{

}

class Dog extends Animal{



}

public class Test {

    public static void main(String[] args) {

        Animal animal=new Animal();
        Dog dog=new Dog();

        Animal animalDog=new Dog(); //Dog IS-A aniaml.

        //reference type variable
        //local variable
        //değişkenin tipi Animal
        //objenin tipi Dog

        //javada reference type  değişken kendi tipinde veya subclass tipindeki bir objeyi gösterebilir.

        //___________________________________________________

       //  Dog dogAnimal=new Animal(); // aNİMAL İS-A DOG DOĞRU DEĞİLDİR.

        //reference type değişken
        //local değişken
        //değişkenin tipi Dog
        //objenin tipi Animal

        // ** javada reference type tipindeki değişken superclass tipindeki bir objeyi gösteremez.


        //___________________________________________________

        Object object=animalDog;

        //Bütün sınıflar için IS-A java.lang.Object doğrudur. !
        //JAVA.LANG.OBJECT SINIF HİYERARŞİSİNİN TEPESİNDE YER ALIR.


    }
}


