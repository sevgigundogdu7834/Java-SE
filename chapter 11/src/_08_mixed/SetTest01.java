package _08_mixed;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {

        //List Interface'ine epey benzeyen Set, verilen verileri bir dizin (index) kullanmadan saklamaktadır. Unordered yapıya sahiptirler.
        // Aynı zamanda Set'ler aynı elemanı iki kere saklamaya izin vermezler.

        Set<String> nameSet=new HashSet<>();

        nameSet.add("Derya");
        nameSet.add("Derya");
        nameSet.add("Akif");
        nameSet.add("Akif");
        nameSet.add("Özgür");
        nameSet.add("Leyla");
        nameSet.add("Burcu") ;
        nameSet.add("Burcu") ;

        for(String a:nameSet){

            System.out.println(a);
        }

        System.out.println("");

        System.out.println(nameSet.size());     // 5 elemanlı

        System.out.println(nameSet.contains("Derya"));   //Derya string ine sahip mi?    //true

        System.out.println(nameSet.remove("Akif"));    //Bir elemanı siler. //true

       nameSet.clear();

        for(String a:nameSet){

            System.out.println(a);
        }

        System.out.println(nameSet.size());   //0

        System.out.println(nameSet.isEmpty()); //true






    }
}
