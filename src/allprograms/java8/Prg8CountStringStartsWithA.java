package allprograms.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg8CountStringStartsWithA {
    public static void main(String[] args) {

        Stream.of("Apple","Amazon","Infosys")
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));

    }
}
