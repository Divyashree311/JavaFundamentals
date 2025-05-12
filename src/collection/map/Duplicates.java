package collection.map;

import java.util.*;

public class Duplicates {

    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();

        map.put(1,"Divya");
        map.put(2,"Divya");
        map.put(3,"Kavya");

        Set<Object> obj = new HashSet<>( map.values());
        System.out.println(obj);

        for(Map.Entry e: map.entrySet()){
            System.out.println(e.getKey() );
            System.out.println(e.getValue());
        }
    }
}
