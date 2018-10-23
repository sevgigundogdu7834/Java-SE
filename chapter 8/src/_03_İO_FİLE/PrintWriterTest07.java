package _03_İO_FİLE;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest07 {

    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("printWriter.txt");
        pw.println("adım :");
        pw.println("soyadım :");
        pw.println("yaşım :");

        pw.close();
    }
}
