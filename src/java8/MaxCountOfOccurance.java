package java8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxCountOfOccurance {

    public static void main(String[] args) {

    Map<String,Long> map = Stream.of("Pen","Pencil","Eraser","Pen","Pen","Eraser")
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

    map.forEach((word,count) -> System.out.println("Word ocuurances word: " + word + ":" + count));

        Map.Entry<String,Long> mapMax =    map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println("Maximum repeated word is " + mapMax );




    }
}
