package _06_numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {

    public static void main(String[] args) {

        NumberFormat nf1=NumberFormat.getCurrencyInstance();   //12.345.678,00 TL
        System.out.println(nf1.format(12345678));


        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.GERMANY);   //12.345.678,00 €
        System.out.println(nf2.format(12345678));

        NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.UK);   //£12,345,678.00
        System.out.println(nf3.format(12345678));

        NumberFormat nf4=NumberFormat.getCurrencyInstance(Locale.US);   //$12,345,678.00
        System.out.println(nf4.format(12345678));

    }

}
