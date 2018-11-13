package _08_mixed;

import java.util.ArrayList;
import java.util.List;

public class GenericTest02 {

    public static void main(String[] args) {

        List<Person> personList=new ArrayList<Person>();

        addElement(personList);   //sıkıntı yok Student IS-A Person , TaxiDriver IS-A Person,

        List<Student> studentList=new ArrayList<Student>();

      //  addElement(studentList);  //compiler error verir.

        TaxiDriver[] taxiDrivers=new TaxiDriver[5];
        addElementArray(taxiDrivers);   //Student IS-A TaxiDriver degil bu nedenle runtime da exceptiona neden olur.

        List<Object> objectList=new ArrayList<>();

        addElementObject(objectList);
      //  addElementObject(studentList);    //compiler error buraya sadece object list gelebilir.

        addElementObject2(objectList);
        addElementObject2(studentList);
        addElementObject2(personList);

    }

    public static void addElement(List<Person> personList){   //Person IS -A NOT Student

        personList.add(new TaxiDriver());
        personList.add(new Person());
        personList.add(new Student());

    }

    public static void addElementArray(Person[] person){

        person[0]= new TaxiDriver();
        person[1]=new Person();
        person[2]=new Student();

    }

    public static void addElementObject(List<Object> objectList){



    }

    public static void addElementObject2(List< ? extends Object> objectList2){


        objectList2.add(null);   //Buraya sadece null eklenebilir.

    }


}

class Person{


}

class Student extends Person{


}

class TaxiDriver extends Person{


}
