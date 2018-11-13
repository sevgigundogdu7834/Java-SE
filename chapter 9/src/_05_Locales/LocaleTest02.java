package _05_Locales;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest02 {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        Locale localItaly=Locale.ITALY;
        Locale local=Locale.CHINESE;
        Locale localTR=new Locale("tr","TR");

        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,localItaly);
        DateFormat df1=DateFormat.getDateInstance(DateFormat.FULL,local);
        DateFormat df2=DateFormat.getDateInstance(DateFormat.FULL,localTR);

        Date date=new Date();

        System.out.println(df.format(date));
        System.out.println(df1.format(date));
        System.out.println(df2.format(date));
    }
}
