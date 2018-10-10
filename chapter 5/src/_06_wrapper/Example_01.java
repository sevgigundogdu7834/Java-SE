package _06_wrapper;

public class Example_01 {

    public static void main(String[] args) {

        int primitive=3;

        //otomatik olarak primitive-> wrapper dönüşüm işlemine AUTOBOXİNG denir.

        Integer wrapper=primitive;  //AUTOBOXİNG

        Integer ınt1=new Integer(100); //B0XİNG
      //  Integer int2=new Integer.valueOf(209);


        Integer ınt3=new Integer(205); //BOXİNG
        int wrapperprimitive=ınt3;  //AUTO-UNBOXİNG

        int primitive2=ınt3.intValue(); //UNBOXİNG

        //wrapper yardımıyla wrapper ->primitive dönüşüm yaptığımızda unboxing
    }

}
