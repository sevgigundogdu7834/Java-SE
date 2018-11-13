package _07_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest03 {

    public static void main(String[] args) {

       /* Pattern p=Pattern.compile("\\d+");                      //1 ya da daha fazla
        Matcher m=p.matcher("java88 56test 394app");

        while (m.find()){

            System.out.println(m.start()+ " :" +m.group());
        }*/


       /* Pattern p=Pattern.compile("\\d?");                      //0 ya da 1
        Matcher m=p.matcher("java88 56test 394app");

        while (m.find()){

            System.out.println(m.start()+ " :" +m.group());
        }*/


    /*    Pattern p=Pattern.compile("\\d*");                      //0 ya da daha fazla
        Matcher m=p.matcher("java889 56test 394app59");

        while (m.find()){

            System.out.println(m.start()+ " :" +m.group());
        }*/


      /*  Pattern p=Pattern.compile("\\d{2}");                      //2 tane digit olsun
        Matcher m=p.matcher("java889 56test 394app59");

        while (m.find()){

            System.out.println(m.start()+ " :" +m.group());
        }*/


        Pattern p=Pattern.compile("\\d{2,3}");                      //2 ya da 3 digit olsun
        Matcher m=p.matcher("java889 56test 394app59");

        while (m.find()){

            System.out.println(m.start()+ " :" +m.group());
        }
    }
}
