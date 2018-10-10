package _07_Inıtıalize_variable;

public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        //Exception in thread "main" java.lang.NullPointerException
        //	at _07_Inıtıalize_variable.Student.main(Student.java:18)

        //student.name null değer döndürdüğünden nullpointerException hatası verir.
        Student student=new Student();
        System.out.println(student.name.toUpperCase());
    }
}
