package _04_returnType;

class Fruit{


}

//char 16 bit unsigned
//int 32 bit signed
//char=-16 gibi bir değer olamaz.
public class Example {

    public String getName(){

        return null;
    }

    public Fruit getFruit(){

        return null;
    }

    public double getDouble(){

        return 2.0;   // return null legal değildir.
    }

    public int getAscıı(){

        char x='A';
        return x;
    }

    //cast yapılması gereklidir.
    public int getNumber(){

        return (int)1000.45;
    }

    public double getNumers(){

        return 1000;
    }

    public static void main(String[] args) {

        Example example=new Example();
        System.out.println(example.getAscıı());
    }
}

//reference type daki  geri dönüş tipine sahip methodta  geriye NULL değer dönebilir.
