package _05_list;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class ListExampleTest02 {

    public static void main(String[] args) {


        List list=new ArrayList();

        //E-> OBJECT

        list.add(1000);
        list.add("2000");
        list.add(true);

        //compiler warning vermez. java.lang.ClassCastException: hatası alınır.
        //java.lang.Integer cannot be cast to java.lang.String

        String a=(String) list.get(0);
        System.out.println(a);

        List<String>   stringList=new ArrayList<String>();
        stringList.add("1000");
       // stringList.add(1999); String olan jenerik e int bir değer eklenemez.
    }
}
