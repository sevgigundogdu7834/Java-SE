package _06_Map;

import java.util.TreeMap;

public class MapTest04 {

    public static void main(String[] args) {

        TreeMap<Integer,String> treeNumber=new TreeMap<>();

        treeNumber.put(1,"value 1");
        treeNumber.put(1,"value 2");
        treeNumber.put(10,"value 3");
        treeNumber.put(10,"value 4");
        treeNumber.put(20,"value 5");

        System.out.println(treeNumber.ceilingEntry(1));
        System.out.println( treeNumber.ceilingKey(10));
        System.out.println( treeNumber.ceilingEntry(20));

    }
}
