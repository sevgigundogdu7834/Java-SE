package _08_mixed;

import java.util.LinkedHashMap;

public class MapTest02 {

    public static void main(String[] args) {

        //LinkHashMap in HashMap ten tek farkı burada key ve value değerleri eklendiği sırada saklanır.

        LinkedHashMap<String,String> linkedHashMapName=new LinkedHashMap<>();

        linkedHashMapName.put("Sevgi","Gündoğdu");
        linkedHashMapName.put("Züleyha","Kaya");
        linkedHashMapName.put("Beytullah","Çitil");
        linkedHashMapName.put("Vedat","Sayar");

        System.out.println(linkedHashMapName);       //{Sevgi=Gündoğdu, Züleyha=Kaya, Beytullah=Çitil, Vedat=Sayar}

        System.out.println(linkedHashMapName.isEmpty());   //false

        System.out.println(linkedHashMapName.size());      //4

        System.out.println(linkedHashMapName.containsValue("Çitil"));   //true

        System.out.println(linkedHashMapName.containsKey("Vedat"));     //true


    }
}
