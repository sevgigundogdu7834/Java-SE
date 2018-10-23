package _01_String;

public class Test_String {


    public static void main(String[] args) {


        Example example=new Example();
        example.setName("reyhan");

        String name1=example.getName();
        name1.concat("Gündoğdu");
        System.out.println(name1);

        name1.toUpperCase();
        System.out.println(name1);

        name1.replace('a','X');


        String str="Sevgi";
        str.concat("Gündoğdu");

        System.out.println( str );

        str=    str.concat("Gündoğdu");
        System.out.println(str);
    }

}
