package _06_Inheritance;

public abstract class Animal {

    public void walk(){

        System.out.println("Animals walk " );

    }

    public abstract void sound();
}

class Dog extends Animal{

    public void bark(){

        System.out.println("Dog bark....");
    }

    @Override
    public void sound() {

        System.out.println("hav hav");
    }
}

class Cat extends Animal{

    public void mew(){

        System.out.println("Cats meww....");
    }

    public void walk(){

        System.out.println("Cats walking....");
    }

    @Override
    public void sound() {

        System.out.println("Miyav....");
    }
}

class Bird extends Animal{


    @Override
    public void sound() {

        System.out.println("Cik Cik....");
    }
}
