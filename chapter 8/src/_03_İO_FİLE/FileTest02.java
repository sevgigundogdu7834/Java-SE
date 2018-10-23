package _03_İO_FİLE;

import java.io.IOException;
import java.io.File;

public class FileTest02 {

    public static void main(String[] args) throws IOException {

        File file=new File("xyz.rar");
        file.createNewFile();

        file.delete();   //DELETE;

        File file2=new File("abc.txt");
        file2.createNewFile();

        File file3=new File("efg.txt");
        file3.createNewFile();

        file3.renameTo(file2);

    }
}
