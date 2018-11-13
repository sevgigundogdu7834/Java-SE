package _08_mixed;

public class Student implements Comparable<Student>{

    private String name;
    private String surname;
    private int age;
    private int schoolNumber;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", schoolNumber=" + schoolNumber +
                '}';
    }

    public Student(String name, String surname, int age, int schoolNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.schoolNumber = schoolNumber;
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

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }


    @Override
    public int compareTo(Student o) {
      //  return Integer.valueOf(schoolNumber).compareTo(o.schoolNumber);   //Küçükten büyüğe doğru karşılaştırır.

      //  return Integer.valueOf(o.schoolNumber).compareTo(schoolNumber);    //Büyükten küçüğe doğru sıralar.

        return name.compareTo(o.name);                                       //Küçükten büyüğe doğru name sıralar.

    }
}
