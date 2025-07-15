package java8.practice2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates {
    public static void main(String[] args) {

        String[] words = {"Java","is","Fun","Java","Fun","hello"};

    Map<String,Long> freq = Stream.of(words)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

    freq.entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .forEach(s -> System.out.println(s));

    }
}
