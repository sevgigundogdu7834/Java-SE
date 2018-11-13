package _06_numberFormat;

import java.text.NumberFormat;

public class NumberFormatTest03 {

    public static void main(String[] args) {

        NumberFormat nf1=NumberFormat.getInstance();


        nf1.setMaximumFractionDigits(5);

        System.out.println(nf1.format(1234.345607866));  //1.234,34561

        nf1.setMinimumFractionDigits(2);
        System.out.println(nf1.format(10));
        System.out.println(nf1.format(10.2));

    }


}
