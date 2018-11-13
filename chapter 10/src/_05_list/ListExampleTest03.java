package _05_list;

import java.util.ArrayList;
import java.util.List;

public class ListExampleTest03 {

    public static void main(String[] args) {

        List<Integer> ıntList=new ArrayList<>();

        ıntList.add(100);
        ıntList.add(200);
        ıntList.add(300);

        ıntList.add(1,1000);
        System.out.println(ıntList);

        List<Integer> ıntList2=new ArrayList<>();
        ıntList2.add(2000);
        ıntList2.add(3000);
        ıntList2.add(4000);

        System.out.println(ıntList2);

        ıntList.addAll(ıntList2);
        System.out.println(ıntList);

        ıntList.remove(1);

        System.out.println(ıntList);

        ıntList.removeAll(ıntList2);

        System.out.println(ıntList);

    }
}
