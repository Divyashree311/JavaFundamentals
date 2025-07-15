package allprograms.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Prg14MapManipulation {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101,"Divya");
        map1.put(102,"AppaAmma");

        Map<Integer, Object> map2 = new HashMap<>();
        map2.put(101,1);
        map2.put(102,2);

        Map<String, Object> map3 = new HashMap<>();

        for(Integer key: map1.keySet()){
            if(map2.containsKey(key)){
                map3.put(map1.get(key),map2.get(key));
            }
        }
        System.out.println(map3);


        map1.entrySet()
                .stream()
                .filter(entry -> map2.containsKey(entry.getKey()))
                .collect(
                        Collectors.toMap(
                                en -> map1.get(en.getKey()),
                                ent -> map2.get(ent.getKey()))
                        )
                .forEach((k,v) -> System.out.println(k+":"+v));


    }
}
