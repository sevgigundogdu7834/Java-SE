package _03_İO_FİLE;

import java.io.File;
import java.io.IOException;

public class Notes {

    public static void main(String[] args) throws IOException {

        File file=new File("a.text");

        //yeni bir java.io.File objesi oluşur.
        //bu haliyle hdd de a.text dosyası oluşmaz.

        System.out.println(file.exists());

        boolean isCreatable= file.createNewFile();

        System.out.println(file.exists());


    }
    //java.io.File

    //file -> dosya

    //bu sınıf hem dosya(file) hem de directory/folder göstermek için kullanılır.
    //File sınıfı dosyadan veri okumak ya da yazmak için kullanılmaz.
    //Yeni bir dosya oluşturmak,directory oluşturmak,dosya silme vs. işlemler için kullanılır.


}
