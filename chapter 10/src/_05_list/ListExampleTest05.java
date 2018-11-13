package _05_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExampleTest05 {

    public static void main(String[] args) {

        String [] array={"elma","armut","limon","yoğurt"};

        List<String> listString= Arrays.asList(array);

        System.out.println(listString);

       // listString.add("sarımsak");      //java.lang.UnsupportedOperationException
       // listString.remove("armut");   //Exception in thread "main" java.lang.UnsupportedOperationException

        listString.set(1,"muz");

        System.out.println(array[2]);
        System.out.println(array.length);

        List<String> sList=Arrays.asList("Mustafa","Kemal","Atatürk");
        System.out.println(sList);


        List<String> list1=new ArrayList<>();

        for(String e:array){

            list1.add(e);
        }

        list1.add("soğan");
        System.out.println(list1);
    }
}
