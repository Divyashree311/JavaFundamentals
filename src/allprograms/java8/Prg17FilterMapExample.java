package allprograms.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg17FilterMapExample {
    public static void main(String[] args) {
        String[][] input ={
                {"Hello hell","Hello hi hello!"},
                {"Hi Hello! wow"}
        };

   long l =     Stream.of(input)
                .flatMap(Arrays::stream)
                .peek(s -> System.out.println("Sentence: " + s))
                .flatMap(s -> Arrays.stream(s.split("\\s+"))) //split string based on whitespace
                 .map( word -> word.replaceAll("[^a-zA-Z]",""))
                .peek(s -> System.out.println("word:"+ s))
                .filter(word -> word.equalsIgnoreCase("hello"))
                .count();
             //   .map(word -> word.toLowerCase())
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        System.out.println("Count of hello:" + l);

    }
}
