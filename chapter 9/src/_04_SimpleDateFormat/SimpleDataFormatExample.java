package _04_SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatExample {

    public static void main(String[] args) {

        Date date=new Date();

        SimpleDateFormat sdf=new SimpleDateFormat();

        sdf=new SimpleDateFormat("MM-dd-yy");   //10-24-18
        System.out.println(sdf.format(date));

        sdf=new SimpleDateFormat("MM-dd-yyyy");   //10-24-2018
        System.out.println(sdf.format(date));

        sdf=new SimpleDateFormat("dd/MM/YYYY");    //24/10/2018
        System.out.println(sdf.format(date));

        sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");    //24/10/2018 11:48:56.291
        System.out.println(sdf.format(date));
    }
}
