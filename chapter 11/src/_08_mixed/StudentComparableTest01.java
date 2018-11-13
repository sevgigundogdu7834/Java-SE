package _08_mixed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableTest01 {

    public static void main(String[] args) {

        Student student=new Student("Sevgi","Gündoğdu",24,201387);
        Student student1=new Student("Züleyha","Kaya",24,201301033);
        Student student2=new Student("Metin","Gündoğdu",18,201301045);
        Student student3=new Student("Ayşegül","Gündoğdu",20,201301061);

        List<Student> listStudent=new ArrayList<>();

        listStudent.add(student);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);

        Collections.sort(listStudent);  //Student IS-A not Copmparable

        for(Student a:listStudent){

            System.out.println(a);
        }

    }
}
