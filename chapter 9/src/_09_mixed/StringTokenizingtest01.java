package _09_mixed;

public class StringTokenizingtest01 {

    public static void main(String[] args) {

        String wordList=new String("deniz gözlerinden alır sonsuzluğun haberini");

        String[] array=wordList.split(" ");

        for(String a:array){

            System.out.println(a);
        }
    }
}
