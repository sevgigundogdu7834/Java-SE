package _05_list;

import java.util.ArrayList;
import java.util.List;

public class ListExampleTest06 {

    public static void main(String[] args) {

        List<String> fruitList=new ArrayList<>();
        fruitList.add("muz");
        fruitList.add("elma");
        fruitList.add("kavun");
        fruitList.add("karpuz");

        System.out.println(fruitList);

        Object[] a= fruitList.toArray();
        String[] b=fruitList.toArray(new String[fruitList.size()]);

       for(Object c:a){

           System.out.println(c);
       }

       for(String d:b){

           System.out.println(d);
       }

       fruitList.add("üzüm");
        System.out.println(fruitList);
    }
}
