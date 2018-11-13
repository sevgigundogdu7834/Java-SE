package _09_mixed;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

public class NumberFormatTest01 {

    public static double number=12244566778899987665.678876;

    public static void main(String[] args) {



        NumberFormat nf=NumberFormat.getInstance();



        System.out.println(nf.format(number));

        NumberFormat nf1=NumberFormat.getInstance(Locale.UK);
        System.out.println(nf1.format(number));

        NumberFormat nf2=NumberFormat.getInstance(Locale.ITALY);
        System.out.println(nf2.format(number));

        NumberFormat nf3=NumberFormat.getInstance(Locale.ENGLISH);
        System.out.println(nf3.format(number));

        }
    }

