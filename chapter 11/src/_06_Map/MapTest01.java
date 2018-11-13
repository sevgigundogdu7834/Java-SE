package _06_Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

    public static void main(String[] args) {

        //Java'da sıkça kullanılan bir diğer veri saklama yolu, Map Interface'i kullanan sınıflardır.
        // Bu sınıflar verileri anahtar - değer mantığına göre saklarlar.
        Map<Integer,String> numberHashMap=new HashMap<>();

        numberHashMap.put(10,"value 1");
        numberHashMap.put(10,"value 2");
        numberHashMap.put(20,"value 3");
        numberHashMap.put(30,"value 4");

        System.out.println(numberHashMap.isEmpty());       //false
        System.out.println(numberHashMap.size());          //3
        System.out.println(numberHashMap.containsKey(20)); //true
        System.out.println(numberHashMap.containsValue("value 3"));  //true
        System.out.println(numberHashMap.get(10));                   //value 2

        System.out.println(numberHashMap);         //{20=value 3, 10=value 2, 30=value 4}

        numberHashMap.clear();

        System.out.println(numberHashMap);        //{}
    }
}
