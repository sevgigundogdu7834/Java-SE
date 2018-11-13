package _08_mixed;

import java.util.LinkedHashSet;

public class LinkHashSetTest01 {

    public static void main(String[] args) {

        //Dublicate elemana izin vermez.HashSet ten tek farkı;HashSet unordered bir yapıya sahiptir.
        //LinkHashSet ordered bir yapıya sahiptir.

        LinkedHashSet<Integer> linkedHashSetNumber=new LinkedHashSet<>();

        linkedHashSetNumber.add(10);
        linkedHashSetNumber.add(20);
        linkedHashSetNumber.add(20);
        linkedHashSetNumber.add(30);
        linkedHashSetNumber.add(40);
        linkedHashSetNumber.add(40);
        linkedHashSetNumber.add(780);
        linkedHashSetNumber.add(870);

        for(int x:linkedHashSetNumber){

            System.out.println(x);
        }

        System.out.println();
        System.out.println(linkedHashSetNumber.size());       //6

        System.out.println();
        System.out.println(linkedHashSetNumber.contains(10));   //true

        System.out.println();
        System.out.println(linkedHashSetNumber.remove(20));

        for(int x:linkedHashSetNumber){

            System.out.println();
            System.out.println(x);
        }

        linkedHashSetNumber.clear();

        System.out.println(linkedHashSetNumber.isEmpty());     //true
    }
}
