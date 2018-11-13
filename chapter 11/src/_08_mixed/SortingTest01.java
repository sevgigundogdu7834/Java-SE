package _08_mixed;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingTest01 {

    public static void main(String[] args) {

        // java.util.Arrays.sort(int[])

        Integer[] numberArray={2,4,0,1,32,65,28,123,34};

        List<Integer> listNumber=new ArrayList<>();
        List<Integer> sortListNumber=new ArrayList<>();

        for(int a:numberArray){

            listNumber.add(a);
        }

        System.out.println(listNumber);         //[2, 4, 0, 1, 32, 65, 28, 123, 34]

        Arrays.sort(numberArray);

        for(int b:numberArray){

            sortListNumber.add(b);
        }

        System.out.println(sortListNumber);    //[0, 1, 2, 4, 28, 32, 34, 65, 123]

        List<Integer> numberList=new ArrayList<>();

        numberList.add(23);
        numberList.add(45);
        numberList.add(2);
        numberList.add(12);
        numberList.add(0);
        numberList.add(60);

        Collections.sort(numberList);

        System.out.println(numberList);     //  [0, 2, 12, 23, 45, 60]

    }
}
