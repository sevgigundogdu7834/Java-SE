package _07_Inıtıalize_variable;

import java.util.Arrays;

public class InıtıalizeTest {

    private int ıntVar;
    private long lonVar;
    private double doubleVar;
    private float floatVar;

    public int getIntVar() {
        return ıntVar;
    }

    public void setIntVar(int[] intVar) {
        this.intVar = intVar;
    }

    public boolean isBoolVar() {
        return boolVar;
    }

    public void setBoolVar(boolean boolVar) {
        this.boolVar = boolVar;
    }

    public Person getPERSON() {
        return PERSON;
    }

    public void setPERSON(Person PERSON) {
        this.PERSON = PERSON;
    }

    public void setIntVar(int ıntVar) {
        this.ıntVar = ıntVar;
    }

    public long getLonVar() {
        return lonVar;
    }

    public void setLonVar(long lonVar) {
        this.lonVar = lonVar;
    }

    public double getDoubleVar() {
        return doubleVar;
    }

    public void setDoubleVar(double doubleVar) {
        this.doubleVar = doubleVar;
    }

    public float getFloatVar() {
        return floatVar;
    }

    public void setFloatVar(float floatVar) {
        this.floatVar = floatVar;
    }

    public String getStrVar() {
        return strVar;
    }

    public void setStrVar(String strVar) {
        this.strVar = strVar;
    }

    private String strVar;
    private int[]  intVar;
    private boolean boolVar;
    private Person PERSON;

    @Override
    public String toString() {
        return "InıtıalizeTest{" +
                "ıntVar=" + ıntVar +
                ", lonVar=" + lonVar +
                ", doubleVar=" + doubleVar +
                ", floatVar=" + floatVar +
                ", strVar='" + strVar + '\'' +
                ", intVar=" + Arrays.toString(intVar) +
                ", boolVar=" + boolVar +
                ", PERSON=" + PERSON +
                '}';
    }
}


class Person{


}
