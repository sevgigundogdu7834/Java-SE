package _06_numberFormat;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatTest04 {

    public static void main(String[] args) throws ParseException {

        NumberFormat nf1=NumberFormat.getInstance();


        System.out.println(  nf1.parse("3456"));
    }
}
