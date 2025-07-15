package allprograms.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prg13FindIndexOfDuplicates {
    public static void main(String[] args) {

        String name = "Divyashree K N".toLowerCase();

        Set<Character> set = new LinkedHashSet<>();
        List l = new ArrayList<>();

        IntStream.range(0,name.length())
                .boxed()
                .filter(ch -> Character.isLetter(name.charAt(ch)))
                .peek(s -> System.out.println(s))
                .collect(Collectors.groupingBy(c -> name.charAt(c)))
                .entrySet()
                .stream()
                .peek(s -> System.out.println(s))
                .filter(entry -> entry.getValue().size() > 1)
                .collect(Collectors.toSet())

          .forEach((k)-> System.out.println(k));


    }
}
