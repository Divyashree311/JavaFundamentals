package allprograms.java8;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg11LongestWordinList {
    public static void main(String[] args) {

        Stream.of("Apple","Amazon","Google","ThankYou")
                .map(word -> word + ":" + word.length())
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));

        Stream.of("Apple","Amazon","Google","ThankYou")
                .map(word -> word + ":" + word.length())
                .max(Comparator.naturalOrder())
                .ifPresentOrElse(
                        val -> System.out.println("Max is:" + val),
                        () -> System.out.println("No max found")
                );
        System.out.println("Nth maximum");

    int length =    Stream.of("Apple","Amazon","Google","ThankYou")
                .map(word ->  word.length())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                        .findFirst().get();

        Stream.of("Apple","Amazon","Google","ThankYou")
                .filter( word -> word.length() == length)
                .collect(Collectors.toList())
                .forEach(s -> System.out.println("Get all:"+s));
    }
}
