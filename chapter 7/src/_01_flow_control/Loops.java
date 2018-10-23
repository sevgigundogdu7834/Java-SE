package _01_flow_control;

import java.util.ArrayList;
import java.util.List;

public class Loops {

    //while
    //do-while
    //for

    //çok fazla for kullanmak iyi bir yaklaşım değildir bu kodu daha az for ile nasıl yazabilirim diye düşünülmelidir.

    //for(declaration:expression)

    public static void main(String[] args) {

    List listName=new ArrayList();

    listName.add("Sevgi");
    listName.add("Kemal");
    listName.add("Ayşe");

    for(Object e:listName){

        System.out.println(e);

    }
    }
}
