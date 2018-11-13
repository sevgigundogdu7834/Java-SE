package _09_mixed;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest2 {

    public static void main(String[] args) {



        NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(nf1.format(NumberFormatTest01.number));                 //12.244.566.778.899.988.000,00 €

        Locale localeTurkey=Locale.getDefault();

        NumberFormat nf2=NumberFormat.getCurrencyInstance(localeTurkey);
        System.out.println(nf2.format(NumberFormatTest01.number));                //12.244.566.778.899.988.000,00 TL


    }
}
