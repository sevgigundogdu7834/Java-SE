package _03_İO_FİLE;

import java.io.File;
import java.io.IOException;

public class FileTest04 {

    public static void main(String[] args) throws IOException {

        File file=new File("klasör");
        file.mkdir();

        File file1=new File(file,"klasör.txt");
        file1.createNewFile();

    }
}
