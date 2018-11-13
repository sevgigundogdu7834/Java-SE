package _08_mixed;

public class ArraySotingManuel {

    public static void main(String[] args) {

        Integer [] array={2,310,5,6,24,54,1,0};

        for(int i=0;i<array.length;i++){

            for(int j=i+1;j<array.length;j++){

                if(array[i]>array[j]){

                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }


        }

        for(int a:array){

            System.out.println(a);
        }
    }
}
