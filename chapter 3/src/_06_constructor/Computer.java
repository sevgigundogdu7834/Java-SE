package _06_constructor;

//abstract sınıflarda dahil olmak üzere bütün sınıflar constructorlara sahiptir.

class Computer1 {

    private double price;

    public Computer1(double price) {
        super();
        this.price = price;
    }


}

class Laptop extends Computer1{

    //yaplandırıcı tanımlamadığımızda otomatik olarak no-arg constructor oluşur.
    Laptop(){

        super(100.09);
    }


}

public class Computer{

    //abstract sınıflardan obje oluşturulamaz.
    Computer1 computer1=new Computer1(34.4);
}
