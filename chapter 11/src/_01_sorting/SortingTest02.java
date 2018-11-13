package _01_sorting;

import java.util.Arrays;

public class SortingTest02 {

    public static void main(String[] args) {

        String[] names={"metin","ayşe","levent","ayten","şahin","Züleyha"};

        Arrays.sort(names);

        for(String a:names){

            System.out.println(a);
        }
    }
}
