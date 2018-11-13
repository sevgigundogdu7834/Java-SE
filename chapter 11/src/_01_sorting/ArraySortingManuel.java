package _01_sorting;

import java.util.ArrayList;
import java.util.List;

public class ArraySortingManuel {

    public static void main(String[] args) {

        Integer[] a={2,3,0,1,9,4,-10};

        List<Integer> list= new ArrayList<>();

        for(int i=0;i<a.length;i++){

            for(int j=1;j<a.length;j++){

                if(a[i]>a[j]){

                    a[i]=a[j];

                }

            }
        }
    }
}
