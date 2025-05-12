package java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByWordLength {
    public static void main(String[] args) {
   Map<Integer, List<String>> map = Stream.of("Divya","Rahul","Amma","Appa")
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
