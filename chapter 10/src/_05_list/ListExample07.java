package _05_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample07 {

    public static void main(String[] args) {

        List<Integer>  intNumber=new ArrayList<>();
        intNumber.add(1);
        intNumber.add(2);
        intNumber.add(3);
        intNumber.add(4);

        for(int i=0;i<intNumber.size();i++){

            System.out.println(i +" . index = " + intNumber.get(i));
        }

        System.out.println();

        for(int a:intNumber){

            System.out.println(a);
        }

        System.out.println();

        Iterator<Integer> intIteratör = intNumber.iterator();

        while (intIteratör.hasNext()){

            Integer e=intIteratör.next();
            System.out.println(e);
        }

        System.out.println();

        ListIterator<Integer> listIterator= intNumber.listIterator();
        while (listIterator.hasNext()){

            Integer ab=listIterator.next();
            System.out.println(ab);
        }

        System.out.println();

        ListIterator<Integer> list1Iterator= intNumber.listIterator();
        while (listIterator.hasPrevious()){

            Integer ab=listIterator.previous();
            System.out.println(ab);
        }
    }
}
