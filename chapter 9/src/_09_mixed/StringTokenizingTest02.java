package _09_mixed;

import java.util.StringTokenizer;

public class StringTokenizingTest02 {

    public static void main(String[] args) {

        //Ayrılan parçalar ise token adı verilir.

        String cümle=new String("Eve bir kilo elma aldım.");

        StringTokenizer stringTokenizer=new StringTokenizer(cümle);

        while(stringTokenizer.hasMoreElements()){

            System.out.println(stringTokenizer.nextToken());

        }

        String cümle1=new String("Elma,armut,ayva,kiraz,üzüm,nar");

        StringTokenizer stringTokenizer1=new StringTokenizer(cümle1,",");

        while (stringTokenizer1.hasMoreElements()){

            System.out.println(stringTokenizer1.nextToken());
        }
    }
}
