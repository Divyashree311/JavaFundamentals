package allprograms.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Prg16SortMapByValues {
    public static void main(String[] args) {
        Map<String,Long> map = new HashMap<>();
        map.put("Divya", 100l);
        map.put("Amma", 200l);
        map.put("Appa", 150l);

        System.out.println("des");

        map.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
              .forEach(System.out::println);
        System.out.println("Asc");
        map.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue())
                .forEach(System.out::println);

    }
}
