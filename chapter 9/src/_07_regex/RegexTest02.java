package _07_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {
    public static void main(String[] args) {

       /* Pattern p=Pattern.compile("\\d");            // digits
        Matcher m=p.matcher("java8 test5");   // 4 10

        while(m.find()){

            System.out.println(m.start());
        }*/



     /*  Pattern p=Pattern.compile("\\D");              //non-digits
       Matcher m=p.matcher("java8 test5");      //0,1,2,3,5,6,7,8,9

       while(m.find()){

           System.out.println(m.start());
       }*/


/*
     Pattern p=Pattern.compile("\\s");                 //white-space (boşluk)
     Matcher m=p.matcher("java8 test5 app3");    //5,11

     while (m.find()){

         System.out.println(m.start());
     }*/


/*

     Pattern p=Pattern.compile("\\S");                //non white-space
     Matcher m=p.matcher("java8 test5");        //0,1,2,3,4,6,7,8,9,10

     while(m.find()){

         System.out.println(m.start());
     }
*/


/*
        Pattern p=Pattern.compile("\\w");                //harf,rakam,karakter
        Matcher m=p.matcher("java8 test5");        //0,1,2,3,4,6,7,8,9,10

        while(m.find()){

            System.out.println(m.start());
        }
        */


        Pattern p=Pattern.compile("a.c");                //. karakteri araya herhangi bir karakter girebilir anlamına gelmektedir.
        Matcher m=p.matcher("ac abc a c a  c");        //3,7

        while(m.find()){

            System.out.println(m.start());
        }



    }

}
