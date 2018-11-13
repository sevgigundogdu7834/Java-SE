package _08_mixed;

import java.util.Arrays;

public class SortingTest02 {

    public static void main(String[] args) {

        String [] nameArray={"elma","armut","ayva","kiraz","üzüm"};

        Arrays.sort(nameArray);

        for(String a:nameArray){

            System.out.println(a);
        }
    }
}
