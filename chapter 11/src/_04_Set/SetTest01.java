package _04_Set;

import java.util.HashSet;
import java.util.Set;
public class SetTest01 {

    public static void main(String[] args) {

        //Duplicate elemana izin vermez.
        //Elemanların nasıl yerleşeceği önceden tahmin edilmez.Unordered/Unpredictible bir yapıya sahiptir.

        Set<Integer> intSet=new HashSet<>();

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
