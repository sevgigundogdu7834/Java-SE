package _09_mixed;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatTest03 {

    public static void main(String[] args) throws ParseException {

        NumberFormat nf1=NumberFormat.getInstance();

        nf1.parse("876556788");


    }
}
