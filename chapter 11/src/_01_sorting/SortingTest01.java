package _01_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SortingTest01 {

    public static void main(String[] args) {

        Integer[] numbers={2,3,4,0,9,10,-2,6,-5,5};

        List<Integer> list= new ArrayList<>();
        for(int a:numbers){

            list.add(a);
        }

        System.out.println(list);

        Arrays.sort(numbers);

        for(int c:numbers){

            System.out.println(c);

        }

        System.out.println("_________________________________________");

        List<Integer> list2=new ArrayList<>();

        list2.add(20);
        list2.add(90);
        list2.add(20);
        list2.add(-37);
        list2.add(100);
        list2.add(-100);

        Collections.sort(list2);

        for(int s:list2){

            System.out.println(s);
        }


    }
}
