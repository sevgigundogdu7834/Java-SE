package _08_mixed;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {

    public static void main(String[] args) {

        Animal animal=new Dog();

        //  List<Animal> animalList=new ArrayList<Dog>();   //compiler error veriyor.

        // Dog IS-A Animal

        //ArrayList IS-A lİST olmasına rağmen compiler error verir.


        Animal[] animals=new Dog[5];
        animals[0]=new Dog();
        animals[1]=new Cat();      //CAT IS-A NOT DOG         //java.lang.ArrayStoreException: HATASI ALIRIZ.
        animals[2]=new Animal();   //ANİMAL IS-A NOT DOG

        //CAT İS A DOG OLMADIĞINDAN RUNTİME DA EXCEPTİON ALIRIZ.
    }


}

class Animal{


}

class Dog extends Animal{


}

class Cat extends Animal{


}
