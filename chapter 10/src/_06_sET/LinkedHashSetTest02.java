package _06_sET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest02 {

    public static void main(String[] args) {

        Set<Integer> numberSet=new LinkedHashSet<>();

        numberSet.add(100);
        numberSet.add(100);
        numberSet.add(200);
        numberSet.add(300);
        numberSet.add(300);
        numberSet.add(400);

        System.out.println(numberSet);

        //HashSetler dublicate yapıya izin vermez.Tekrar eden sayıları yazdırmaz.
        //Ordered bir yapıya sahiptir.Elemanlara eklendiği sırada görünür.
    }
}
