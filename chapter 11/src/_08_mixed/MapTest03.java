package _08_mixed;

import java.util.HashMap;

public class MapTest03 {

    public static void main(String[] args) {

        Student student=new Student("Tahir","Kaleli",34,3456666);
        Student student1=new Student("Zühre","Kaleli",33,3456664);

        HashMap<Integer,Student> hashMap=new HashMap<>();

        hashMap.put(1,student);
        hashMap.put(8,student1);

        System.out.println(hashMap);
    }
}
