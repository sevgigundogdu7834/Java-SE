package _01_Inıtıalıze_Variable;

import java.util.Arrays;


// Test{intVar=0, doubleVar=0.0, floatVar=0.0, byteVar=0, intArray=null, stringVar='null', student=null, boolVar=false}
//primitive değerler dışında herşey reference type dır.null assign edilir.
public class Test {

    private int intVar;           //0
    private double doubleVar;     //0.0
    private float floatVar;       //0.0
    private byte byteVar;         //0
    private int[] intArray;       //reference type null
    private String stringVar;     //reference type null
    private Student student;      //reference type null
    private boolean boolVar;      //false

    @Override
    public String toString() {
        return "Test{" +
                "intVar=" + intVar +
                ", doubleVar=" + doubleVar +
                ", floatVar=" + floatVar +
                ", byteVar=" + byteVar +
                ", intArray=" + Arrays.toString(intArray) +
                ", stringVar='" + stringVar + '\'' +
                ", student=" + student +
                ", boolVar=" + boolVar +
                '}';
    }

    public static void main(String[] args) {

        Test test=new Test();
        System.out.println(test);
    }
}
