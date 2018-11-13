package _08_mixed;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {

    public static void main(String[] args) {

        List list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add("elma");

        System.out.println(list);   //[10, 20, 30]

        String a=(String)list.get(2);     //cast etmek gerekir.
       int b=(int) list.get(0);

       //Jenerikler Compiler Time da çalışır, Run Time da dimand işaretleri uçar.

        //Cast etme işlemini ortadan kaldırır.

        List<Integer> numberList=new ArrayList<>();
        numberList.add(30);
        numberList.add(40);


        addElement(numberList);

        System.out.println(numberList);

    }

    public static void addElement(List sList){    //run time da dimond işaretleri kalktı.  List<Integer> numberList=new ArrayList<>();
                                                  //List sList

        sList.add("elma");
        sList.add("ayva");

    }
}
