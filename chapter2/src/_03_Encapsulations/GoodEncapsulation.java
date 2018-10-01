package _03_Encapsulations;

public class GoodEncapsulation {



    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age<0) age=0;
        System.out.println(" Age :" +age);
    }

    private int age;


}
