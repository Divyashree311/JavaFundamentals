package allprograms.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg5GroupByWordLength {
    public static void main(String[] args) {

    Map<Integer, List<String>> map = Stream.of("Java","is","a","simple","lang","Java","is","fun")
                .collect(Collectors.groupingBy(String::length));

        System.out.println(map);

     map.forEach((k, v) -> {
         System.out.println(k + " " +v);
     });

    }
}
