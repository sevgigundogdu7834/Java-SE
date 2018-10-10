package _03_variable_casting;

class Animal{


}

class Dog extends Animal{

    public void bark(){

        System.out.println("Dog bark..");
    }

}

class Cat extends Animal{

    public void mew(){

        System.out.println("Cat meww..");
    }

}
public class Test {

    public static void main(String[] args) {

        // Animal animal=new Animal();

        // Dog dog=(Dog) animal;   //****CLASSCASTEXCEPTİON hatası verir.

        //*******downcasting
        //kalıtım hiyerarşisinde üst sınftan alt sınıfa (super - sub) casting ->-> DownCasting

        //Dog tipindeki bir değişken animal tipindeki bir objeyi gösteremez.

        //Animal IS_A Dog değildir.


        Animal animalDog=new Dog();
        Dog dog1=(Dog) animalDog;

        if(animalDog instanceof Dog){

            Dog dog2=(Dog)animalDog;
        }

        else if(animalDog instanceof Cat)

        {
            Cat cat2=(Cat) animalDog;
        }
    }


    Dog dog=new Dog();
    Animal animals=dog;   //***upcasting

    //burada CLASSCASTEXCEPTİON riski yoktur.
    //implicit/kapalı bir şekilde yapılabilir.

    Dog dog3=new Dog();
    Animal animals1=(Animal) dog;

    //explicit/açık bir şekilde de yapılabilir ancak tercih edilemez.





}
