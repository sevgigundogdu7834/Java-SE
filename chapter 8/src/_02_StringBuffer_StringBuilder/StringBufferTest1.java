package _02_StringBuffer_StringBuilder;

public class StringBufferTest1 {

    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("in");
        sb.append("java");
        sb.append("we");
        sb.append("trust");

        System.out.println(sb);

        String str="in";
        str=str+" java ";
        str=str+" we ";
        str=str+" trust ";

        System.out.println(str);

    }
}
