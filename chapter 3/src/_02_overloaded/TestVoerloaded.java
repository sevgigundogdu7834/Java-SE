package _02_overloaded;

class Calculator {

    public void calculate(int a,int b){

        System.out.println("int int");
    }

    public void calculate(double a,double  b){

        System.out.println("double double");
    }
}

public class TestVoerloaded {

    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        calculator.calculate(10,10);
        calculator.calculate(10.0,10.0);
        calculator.calculate(10,10.0);
        calculator.calculate(10.0f,10);
    }
}

//10 -> javada tam sayıların tipi int dir.
//10.0 -> javada noktalı/küsüratlı sayıların tipi double dır.
//10.0f -> float
