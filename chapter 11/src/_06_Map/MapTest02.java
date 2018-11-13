package _06_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest02 {

    public static void main(String[] args) {

        Map<Integer,String> numberMap=new HashMap<>();

        numberMap.put(1,null);
        numberMap.put(1,null);

        System.out.println(numberMap);


        Map<Integer,String> numberHashTable=new Hashtable<>();

        numberHashTable.put(1,null);                   //Exception in thread "main" java.lang.NullPointerException
        numberHashTable.put(1,null);                   //Exception in thread "main" java.lang.NullPointerException

        System.out.println(numberHashTable);

        //HashTable da key ya da value değerleri null olmaz.
        //metotları sycronized
        //unordered özellik gösterir.
    }
}
