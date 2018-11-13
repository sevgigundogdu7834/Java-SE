package _09_mixed;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest02 {

    public static void main(String[] args) {


        Date date=new Date();


        Locale locale1=Locale.ITALY;
        Locale locale2=Locale.CHINESE;
        Locale locale3=Locale.GERMANY;

        DateFormat df1=DateFormat.getDateInstance(DateFormat.FULL,locale1);       //mercoledì 31 ottobre 2018
        DateFormat df2=DateFormat.getDateInstance(DateFormat.FULL,locale2);       //2018年10月31日 星期三
        DateFormat df3=DateFormat.getDateInstance(DateFormat.FULL,locale3);       //Mittwoch, 31. Oktober 2018

        System.out.println(df1.format(date));
        System.out.println(df2.format(date));
        System.out.println(df3.format(date));
    }
}
