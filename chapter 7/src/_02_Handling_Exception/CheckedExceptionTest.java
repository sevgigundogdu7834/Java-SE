package _02_Handling_Exception;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class CheckedExceptionTest {

    public static void main(String[] args) throws IOException,SQLException {

        FileWriter fileWriter=new FileWriter("metin.txt");

        //IO Exception bir checked Exception dır..

        // public FileWriter(String fileName) throws IOException {
        //        super(new FileOutputStream(fileName));
        //    }

        //checked exceptionlar için handle or declare kuralına uymamız gerekmektedir.

        //yani,bir checked exception fırlatan method/constructorı kullandığımızda(throws);

        //bu durumda iki yoldan birini kullanmamızı gerektirmektedir.

        //1) handle (try catch arasına al)
        //2) declare (methoda throws olarak ekle)

        //bu kurala uymamamız gerekmektedir aksi takdirde compiler error alırız.

        //gramer olarak unchecked excetionları da throws ile fırlatabiliriz.(pratik olarak yapılmaz.)

        //Bu kural unchecked exceptionlar için geçerli değildir.

        //________________________________________________________________________________________________________

        //***SQLException bir checked exceptiondır.Yani IS-A RuntimeException değildir.
        //Bundan dolayı handle ya da declare dilmesi gerekmektedir.

        testException1();

     /*   try {

            testException1();

        } catch (SQLException e) {

            e.printStackTrace();
        }*/


     //*** NullPointException bir unchecked Exception dır.Yani runTime exceptiondır.
        //Bu yüzden handle ya da declare dilmesine gerek yoktur.
     testException2();
     


    }

    public static void testException1() throws SQLException {


    }

    public static void testException2() throws NullPointerException{


    }
}
