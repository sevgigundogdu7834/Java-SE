package _02_StringBuffer_StringBuilder;

public class StringBufferTest02 {

    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("test_java");
        sb.insert(4,"CONTENT");

        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.delete(1,4));
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
    }

}
