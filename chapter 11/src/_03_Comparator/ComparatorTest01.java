package _03_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest01 {

    public static void main(String[] args) {

        PersonComparator2 pc2=new PersonComparator2();

        Person person1=new Person(2,"Sevgi","Gündoğdu",78);
        Person person2=new Person(7,"Züleyha","Kaya",29);

        List<Person> list= new ArrayList<>();
        list.add(person1);
        list.add(person2);

        Collections.sort(list,pc2);

        for(Person a:list){

            System.out.println(a);
        }

    }
}

class PersonComparator1{


}

class PersonComparator2 implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {

        return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
    }
}

class Person{

    private int id;
    private String name;
    private String surname;
    private int age;

    public Person(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
