package Mixed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class benimException extends Exception{

}

class Deneme {

    void f () throws benimException{

        throw new benimException();
    }
}


public class Test {

    public static void main(String[] args) throws benimException{

        Deneme deneme=new Deneme();
       deneme.f();


        File file=new File("a.txt");
        try {

            int [] x=new int[10];
            System.out.println(x[29]);

           BufferedReader bufferedReader=new BufferedReader(new FileReader(file));



        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (ArrayIndexOutOfBoundsException f) {
            f.printStackTrace();
        }

    }




}

