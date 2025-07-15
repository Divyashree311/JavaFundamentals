package java8.practice2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMapByItsValue {
    public static void main(String[] args) {
        Map<String,Long> map = new HashMap<>();
        map.put("Divya", 100l);
        map.put("Amma", 200l);
        map.put("Appa", 150l);

   map.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
           .collect(Collectors.toMap(
                   Map.Entry::getKey,
                   Map.Entry::getValue
           ))
           .forEach((k,v)-> System.out.println(k + ":" + v));

        System.out.println("------------DESC-----------------");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (k,v) -> k, LinkedHashMap::new
                ))
                .forEach((a,b) -> System.out.println(a +":"+ b));


    }
}
