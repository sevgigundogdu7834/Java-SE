package _02_StringBuffer_StringBuilder;

public class StringBufferTest3 {

    public static void main(String[] args) {

        String str=new String("Sevgi");
        String sbr=new String("Sevgi");

        System.out.println(str.equals(sbr));

        StringBuffer sbr1=new StringBuffer("Kaya");
        StringBuffer sb2=new StringBuffer("Kaya");

        System.out.println(sbr1.equals(sb2));

        StringBuilder slb=new StringBuilder("naber");
        StringBuilder slb1=new StringBuilder("naber");

        System.out.println(slb.equals(slb1));

        //StringBuilder ve StringBuffer sınıfları için equals override edilmemiştir.
        //Bu sınıflar için equals == ile aynı çalışır.
    }
}
