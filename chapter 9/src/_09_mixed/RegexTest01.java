package _09_mixed;



import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTest01 {

    //Regular expression bir metni düzenlemek yada metin içerisinden belli kurallara
    // uyan alt metinler elde etmek için kullandığımız bir dildir.

    public static void main(String[] args) {

        Pattern pattern=Pattern.compile("a");            //a
        Matcher matcher=pattern.matcher("java");

        while (matcher.find()){


            System.out.println(matcher.start());    // 1,3
        }

        System.out.println("_________ pattern 1");

        Pattern pattern1=Pattern.compile("av");          //av
        Matcher matcher1=pattern1.matcher("java");

        while(matcher1.find()){

            System.out.println(matcher1.start());   //1
        }

        System.out.println("_________ pattern 2");

        Pattern pattern2=Pattern.compile("a|v");          //a ya da v
        Matcher matcher2=pattern2.matcher("java");  // 1 2 3

        while(matcher2.find()){

            System.out.println(matcher2.start());
        }

        System.out.println("_________ pattern 3");

        Pattern pattern3=Pattern.compile("[av]");            //a ya da v
        Matcher matcher3=pattern3.matcher("java");     // 1 2 3

        while(matcher3.find()){

            System.out.println(matcher3.start());
        }

        System.out.println("_________ pattern 4");

        Pattern pattern4=Pattern.compile("a-z");
        Matcher matcher4=pattern4.matcher("java");

        while (matcher4.find()){

            System.out.println(matcher4.start());
        }

        Pattern pattern5=Pattern.compile("ab");
        Matcher matcher5=pattern5.matcher("ababababbac");   // 0 2 4 6

        while(matcher5.find()){

            System.out.println(matcher5.start());
        }




    }
}
