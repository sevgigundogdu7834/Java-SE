package _03_İO_FİLE;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter05 {

    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("sdf.txt"); //append her seferinde sonuna ekler.
        fw.write(" one");
        fw.write(" two");
        fw.write(" three");
        fw.write(" four");

        fw.close();



        FileReader fr=new FileReader("sdf.txt");

        char [] fileArray=new char[20];
        fr.read(fileArray);

        for(char a:fileArray){

            System.out.println(a);
        }

        fr.close();
    }
}
