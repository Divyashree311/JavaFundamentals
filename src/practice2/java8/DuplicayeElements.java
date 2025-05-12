package practice2.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicayeElements {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Stream.of(1,2,3,4,2,3)
                .filter(x -> !set.add(x))
                        .collect(Collectors.toSet())
                .forEach(s -> System.out.println(s));
    }
}
