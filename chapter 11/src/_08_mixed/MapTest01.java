package _08_mixed;

import java.util.HashMap;

public class MapTest01 {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"value 1");
        hashMap.put(2,"value 2");
        hashMap.put(3,"value 2");
        hashMap.put(3,"value 3");
        hashMap.put(4,"value 4");
        hashMap.put(5,null);
        hashMap.put(null,null);

        System.out.println(hashMap);   //{1=value 1, 2=value 2, 3=value 3, 4=value 4}

        System.out.println(hashMap.isEmpty());                     //false
        System.out.println(hashMap.size());                        //4
        System.out.println(hashMap.containsKey(2));                //true
        System.out.println(hashMap.containsValue("value 3"));      //true
        System.out.println(hashMap.get(4));                        //value 4

        hashMap.clear();
        System.out.println(hashMap.size());                        //0



    }
}
