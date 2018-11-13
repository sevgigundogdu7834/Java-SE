package _09_mixed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {

    public static void main(String[] args) {

        Pattern pattern=Pattern.compile("\\d");                           //digits
        Matcher matcher=pattern.matcher("java8 test5");             // 4 10

        while(matcher.find()){

            System.out.println(matcher.start());
        }

        System.out.println("__________________-___________________");     //non-digits

        Pattern pattern1=Pattern.compile("\\D");                          //0 1 2 3 5 6 7 8 9
        Matcher matcher1=pattern1.matcher("java8 test5");

        while (matcher1.find()){

            System.out.println(matcher1.start());
        }

        System.out.println("__________________-___________________");

        Pattern pattern2=Pattern.compile("\\s");                          //white-space
        Matcher matcher2=pattern2.matcher("java8 test5");          //5

        while (matcher2.find()){

            System.out.println(matcher2.start());
        }

        System.out.println("__________________-___________________");

        Pattern pattern3=Pattern.compile("\\S");                          //non white-space
        Matcher matcher3=pattern2.matcher("java8 test5");          //0 1 2 3 4 6 7 8 9 10

        while (matcher3.find()){

            System.out.println(matcher3.start());
        }

        System.out.println("__________________-___________________");

        Pattern pattern4=Pattern.compile("\\w");                          //harf rakam karakter
        Matcher matcher4=pattern4.matcher("java8 test5");          //0 1 2 3 4 6 7 8 9 10

        while (matcher4.find()){

            System.out.println(matcher4.start());
        }

        System.out.println("__________________-___________________");

        Pattern p=Pattern.compile("a.c");                //. karakteri araya herhangi bir karakter girebilir anlamına gelmektedir.
        Matcher m=p.matcher("ac abc a c a  c");        //3,7

        while(m.find()){

            System.out.println(m.start());
        }

    }
}
