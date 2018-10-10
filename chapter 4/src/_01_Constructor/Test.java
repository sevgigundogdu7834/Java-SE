package _01_Constructor;

public class Test {

    private String name;
    private String surname;
    private int age;

    public Test(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private Test(){
        // System.out.println("gfghhgdfshghgf");    LEGAL DEĞİLDİR.*****
        this("Sevgi","Gündoğdu",24);
        //this ifadesi super() de olduğu gibi en üstte yer almalıdır.
    }
}
