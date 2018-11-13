package _08_mixed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComparatorStudentTest01 {

    public static void main(String[] args) {

        //Comparable daha çok iki objeyi karşılaştırmak üzere kullanılır.

        Comparator1 comparator1=new Comparator1() ;

        Student student=new Student("Sevgi","Gündoğdu",24,2013087 );
        Student student1=new Student("Erdal","Öztürk",26,2013098 );

        List<Student> listStudent=new ArrayList<Student>();

        listStudent.add(student);
        listStudent.add(student1);

        Collections.sort(listStudent,comparator1);

        for(Student a:listStudent){

            System.out.println(a);
        }



    }
}

