package _01_override;


class Animal{

    //instance değişkenler için override söz konusu değildir.
    //static methodlar için override söz konusu değildir.

    int height=100;

    public void eat(){

        System.out.println("Animal eat");


    }}



class Dog extends Animal{

    int height=200;

    @Override
    public void eat(){

        System.out.println("Dog eat");
    }


}


public class TestOverride {

    public  void main(String[] args) {

        Animal animalDog=new Dog();
        animalDog.eat();

        System.out.println(animalDog.height);




    }}



