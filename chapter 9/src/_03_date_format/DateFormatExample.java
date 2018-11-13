package _03_date_format;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample {


    public static void main(String[] args) {

        Date date=new Date();

        System.out.println(date);    //Wed Oct 24 11:38:24 EET 2018

        DateFormat df1=DateFormat.getInstance();    //default format  //24.10.2018 11:38
        System.out.println(df1.format(date));

        DateFormat df2=DateFormat.getDateInstance(DateFormat.MEDIUM);   //24.Eki.2018
        System.out.println(df2.format(date));

        DateFormat df3=DateFormat.getDateInstance(DateFormat.LONG);   //24 Ekim 2018 Çarşamba
        System.out.println(df3.format(date));

        DateFormat df4=DateFormat.getDateInstance(DateFormat.FULL);    //24 Ekim 2018 Çarşamba
        System.out.println(df4.format(date));


    }
}
