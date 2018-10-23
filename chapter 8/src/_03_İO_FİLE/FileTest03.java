package _03_İO_FİLE;

import java.io.File;

public class FileTest03 {

    public static void main(String[] args) {

        File file=new File("/Users/sevgigundogdu");

        String[] stringFile=file.list();

        for(String f:stringFile){

            System.out.println(f);
        }


        File [] fileArray=file.listFiles();

        for(File f:fileArray){

            if(f.isDirectory()){

                System.out.println("dir :"+f.getName());
            }

            System.out.println("file :" +f.getName());
        }


    }
}
