package _01_toString;

public class Test01 {

    private String name;
    private String surname;
    private int age;
    private String meslek;

    public Test01(String name, String surname, int age, String meslek) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.meslek = meslek;
    }

    @Override
    public String toString() {
        return "Test01{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", meslek='" + meslek + '\'' +
                '}';
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

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }


}

//java.lang.Object sınıf hiyerarşisinin en tepesinde yer alır.
//java.lang paketi otomatik olarak import edilir.


