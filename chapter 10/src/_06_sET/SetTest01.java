package _06_sET;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {

        Set<Integer> numberSet=new HashSet<>();

        numberSet.add(100);
        numberSet.add(100);
        numberSet.add(200);
        numberSet.add(300);
        numberSet.add(300);
        numberSet.add(400);

        System.out.println(numberSet);

        //HashSetler dublicate yapıya izin vermez.Tekrar eden sayıları yazdırmaz.
        //Unordered bir yapıya sahiptir.Elemanlara eklendiği sırada görünmez.
    }
}
