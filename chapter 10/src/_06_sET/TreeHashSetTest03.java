package _06_sET;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeHashSetTest03 {

    public static void main(String[] args) {

        Set<Integer> numberSet=new TreeSet<>();

        numberSet.add(100);
        numberSet.add(100);
        numberSet.add(-200);
        numberSet.add(300);
        numberSet.add(300);
        numberSet.add(400);

        System.out.println(numberSet);

        //TreeSet sorted bir yapıya sahiptir.
        //Elemanlar küçükten büyüğe doğru sıralanır.
    }
    }

