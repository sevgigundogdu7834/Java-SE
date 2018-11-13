package _06_numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {

    public static void main(String[] args) {

        NumberFormat nf1=NumberFormat.getInstance();

        NumberFormat nf2=NumberFormat.getInstance(new Locale("tr","TR"));

        double number=123456789.456789;

        System.out.println(number);    // 1.23456789456789E8

        System.out.println(nf1.format(number));   //123.456.789,457
        System.out.println(nf2.format(number));   //123.456.789,457

    }
}
