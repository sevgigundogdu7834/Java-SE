package _02_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest01 {

    public static void main(String[] args) {

        Person person1=new Person(1,"Leyla","Bakan",21);
        Person person2=new Person(6,"Cemile","Gündoğdu",20);
        Person person3=new Person(0,"Sevim","Gündoğdu",45);
        Person person4=new Person(27,"Ayça","Aktaş",49);



        List<Person> list= new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        Collections.sort(list); //Compiler error verir çünkü; Person Comparable değildir.Hangi elemana göre sıralanacağı bilinmez.

        for(Person a:list){

            System.out.println(a);
        }

    }
}

class Person implements Comparable<Person>{

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

    @Override
    public int compareTo(Person o) {

        return Integer.valueOf(o.id).compareTo(id);     // id'ye göre büyükten küçüğe doğru sıralama yapar.
        //return name.compareTo(o.name);                name ye göre küçükten büyüğe doğru sıralar.
       // return Integer.valueOf(id).compareTo(o.id);   id'ye göre küçükten büyüğe doğru sıralar.
    }
}
