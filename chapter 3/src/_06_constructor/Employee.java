package _06_constructor;

public class Employee {

    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(){

        System.out.println("İnvoked!......");
    }


}
