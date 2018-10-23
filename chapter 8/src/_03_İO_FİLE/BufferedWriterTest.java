package _03_İO_FİLE;

import java.io.*;

public class BufferedWriterTest {

    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("www.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("test");
        bw.write("\n");
        bw.write("test2");
        bw.write("\n");
        bw.write("test3");
        bw.write("\n");

        bw.close();

        FileReader fr=new FileReader("www.txt");
        BufferedReader br=new BufferedReader(fr);

        String bufferedString=null;

        while((bufferedString=br.readLine())!=null){

            System.out.println(bufferedString);
        }



    }
}
