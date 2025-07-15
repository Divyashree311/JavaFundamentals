package allprograms.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg1UniqueNumbers {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        System.out.println("Unique numbers");
        Stream.of(1,2,1,3,2,4,2)
                .distinct()
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));

        System.out.println("Duplicate numbers");

        Stream.of(1,2,1,3,2,4,2)
                .filter(list -> !set.add(list))
                .collect(Collectors.toSet())
                .forEach(s -> System.out.println(s));




    }
}
