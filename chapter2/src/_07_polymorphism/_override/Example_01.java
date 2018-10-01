package _07_polymorphism._override;

class  Animal{

    public void eat(){

        System.out.println("Animal_eat");

    }

    public void run(){

        System.out.println("Animal_running....");
    }
}

class Dog extends Animal{

    @Override
    public void eat(){

        System.out.println("Dog_eat....");

    }

    @Override
    public void run(){

        super.run();
        System.out.println("extra configuration business logic ---- extra logic....");

    }


}
public class Example_01 {

    public static void main(String[] args) {

        Animal animal=new Animal();
        animal.eat();

        Dog dog=new Dog();
        dog.eat();

        Animal animalDog=new Dog();
        animalDog.eat();

       // Dog dogAnimal=new Animal(); //dogru bir kullanım değil.

        //******
        //override söz konusu olduğunda hangi metodun çalışacağına run-time da karar verilir.(late binding)
        //ve ilgili metot çalışır.Objenin tipi Dog olduğundan Dog classının eat metodu çalıştı.
        //dynamic dispatch adı verilir.

         dog.run();

    }
}
