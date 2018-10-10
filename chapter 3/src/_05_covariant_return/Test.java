package _05_covariant_return;

class Computer{


}

class Laptop extends Computer{


}

class SuperClass{

    public Computer getComputer(){

        return null;
    }
}

class SubClass extends SuperClass{

    @Override
    public Laptop getComputer(){     //**** Laptop IS-A Computer olduğundan override söz konusu olduğunda geri dönüş tipi değişebilir.

        return null;
    }
}
public class Test {


}
