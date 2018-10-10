package _06_constructor;

class Animal{

    Animal(){

        super();
        System.out.println("Animal constructor");
    }

}

class Dog extends Animal{

    Dog(){

        super();
        System.out.println("Dog constructor");
    }


}

class Kangal extends Dog{

    Kangal(){

        super();     //javada constructorlarda varsayılan olarak super() ifadesi bulunur.
        System.out.println("Kangal constructor");
    }

}

public class Test {
    public static void main(String[] args) {

        Kangal kangal=new Kangal();

        //Kangal objesi oluşturuyoruz.
        //objenin tipi Kangal.
        //******Constructor chaining-----> en üst super classa ait constructor çalışır sırasıyla aşağıya doğru inmeye çalışır.
    }

}
