package _07_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {

    public static void main(String[] args) {

//        Pattern pattern=Pattern.compile("a");
//        Matcher matcher= pattern.matcher("java");
//
//        while (matcher.find()){
//
//            System.out.println(matcher.start());
//        }


       /* Pattern pattern=Pattern.compile("av");
        Matcher matcher= pattern.matcher("java");

        while (matcher.find()){

            System.out.println(matcher.start());   // 1
        }*/


       /* Pattern pattern=Pattern.compile("a|v");  //a ya da v
        Matcher matcher= pattern.matcher("java");  // 1 2 3

        while (matcher.find()){

            System.out.println(matcher.start());
        }*/

       /* Pattern pattern=Pattern.compile("[av]");          //a ya da v
        Matcher matcher= pattern.matcher("java");  // 1 2 3

        while (matcher.find()){

            System.out.println(matcher.start());
        }*/

       /* Pattern pattern=Pattern.compile("[a-k]");          //a,b,c,d.........k
        Matcher matcher= pattern.matcher("java");  // 0 1 2 3

        while (matcher.find()){

            System.out.println(matcher.start());
        }*/

       /* Pattern pattern=Pattern.compile("ab");
        Matcher matcher= pattern.matcher("ababababc");  // 0 2 4 6

        while (matcher.find()){

            System.out.println(matcher.start());
        }
*/
        Pattern pattern=Pattern.compile("aba");
        Matcher matcher= pattern.matcher("ababababc");  // 0 4

        while (matcher.find()){

            System.out.println(matcher.start());
        }

    }

    //java.util.regex.Matcher
    //java.util.regex.Pattern
}
