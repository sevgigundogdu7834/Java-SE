package _05_LinkHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetTest01 {

    public static void main(String[] args) {

        //Duplicate elemana izin vermez.
        //Elemanlar ordered sırada yani eklendiği sırada gelir.HashSet ' ten farkı budur.

        Set<Integer> intSet=new LinkedHashSet<>();

        intSet.add(10);
        intSet.add(10);
        intSet.add(10);
        intSet.add(10);
        intSet.add(10);
        intSet.add(10);
        intSet.add(20);
        intSet.add(30);

        System.out.println(intSet.isEmpty());        //false

        System.out.println(intSet.size());           //3

        for(int a:intSet){

            System.out.println(a);
        }
    }
    }

