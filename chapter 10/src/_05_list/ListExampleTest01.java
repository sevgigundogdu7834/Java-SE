package _05_list;

import java.util.List;
import java.util.ArrayList;

public class ListExampleTest01 {

    public static void main(String[] args) {

        List<String> listString=new ArrayList<String>();

        //public interface List<E> extends Collection<E>

        //E -> String

        //boolean add(E e);
        //boolean add(String e)

        //E get(int index);

        //String get(int index)

        List<Integer> ıntegerList=new ArrayList<Integer>();

        //E ->Integer

        //boolean add(Integer e)

        //E get(int index)

        //Integer get(int index)

        //****
        // List<int> intList=new ArrayList<int>()        ***legal değildir.
        //E ->int olamaz. E ->Integer olabilir.
        //primitive olamaz.Collections elemanları Object olmalıdır.

        System.out.println(listString);                  //[]
        System.out.println(listString.isEmpty());        //true

        listString.add("element 1");
        listString.add("element 2");
        listString.add("element 3");
        listString.add("element 4");
        listString.add("element 5");

        System.out.println(listString.size());    //5
        System.out.println(listString.get(2));   //element 3

        //Exception in thread "main" java.lang.IndexOutOfBoundsException: sınır taşarsa bu hata alınır.

        System.out.println(listString.contains("element 1"));   //true
        System.out.println(listString.contains("element 2"));   //true

        System.out.println(listString);      //[element 1, element 2, element 3, element 4, element 5]

        listString.remove("element 1");
        listString.remove("element 2");

        System.out.println(listString);      //[element 3, element 4, element 5]

        listString.clear();
        System.out.println(listString);    //[]
    }

}
