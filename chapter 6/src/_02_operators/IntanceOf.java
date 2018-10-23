package _02_operators;

interface Cleanable{


}
class House{


}

class Dublex extends House implements Cleanable{


}
public class IntanceOf {

    public static void main(String[] args) {

        Dublex dublex=new Dublex();

        System.out.println(dublex instanceof Dublex); // ? dublex IS-A Dublex ------>true;
        System.out.println(dublex instanceof House); // ? dublex IS-A House ------>true;
        System.out.println(dublex instanceof Cleanable); // ? dublex IS-A Cleanable ------>true;


    }
}
