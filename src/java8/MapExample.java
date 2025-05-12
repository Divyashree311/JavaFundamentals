package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Divya");
        map1.put(3,"Rahul");
        map1.put(2,"Amma");
        map1.put(4,"Appa");

        Map<Integer,Object> map2 = new HashMap<>();
        map2.put(1,101);
        map2.put(2,202);
        map2.put(3,303);
        map2.put(4,404);

        Map<String,Object> map3 = new HashMap<>();

        for (Integer key: map1.keySet()){
                if(map2.containsKey(key)){
                    map3.put(map1.get(key),map2.get(key));
                }

            }

        System.out.println(map3);


        //java 8

        map1.entrySet().stream()
                .filter(entry -> map2.containsKey(entry.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        entry -> map2.get(entry.getKey())
                ));


    }


}
