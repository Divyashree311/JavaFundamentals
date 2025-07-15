package allprograms.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg6CountStringStartsWithA {

    public static void main(String[] args) {

        System.out.println("Words starting with A");
        Stream.of("Apple","Amazon","Nvidia","Infosys")
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));

        System.out.println("Count the Words starting with A");
    int count =   (int) Stream.of("Apple","Amazon","Nvidia","Infosys")
                .filter(word -> word.startsWith("A"))
                .count();


        System.out.println(count);
    }
}
