package _03_İO_FİLE;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileTest01 {

    public static void main(String[] args) throws IOException {

        File file =new File("folder");
        file.mkdir();

        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());
        System.out.println(file.getParent());
        System.out.println("___________________________________________________");

        File file2=new File(file,"sevgi.txt");
        file2.createNewFile();

        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.lastModified());







    }
}
