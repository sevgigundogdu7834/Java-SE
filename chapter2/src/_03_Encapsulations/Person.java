package _03_Encapsulations;

public class Person {


    //değişkenleri private al
    //getter and setter methodları public olarak tanımla
    //methodlar isimlendirme kurallarına uygun olarak tanımlansın(zaten ide ile tanımlanıyor)

    private int id;
    private String name;
    private String surname;
    private String schooll_number;

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

    public String getSchooll_number() {
        return schooll_number;
    }

    public void setSchooll_number(String schooll_number) {
        this.schooll_number = schooll_number;
    }






}
