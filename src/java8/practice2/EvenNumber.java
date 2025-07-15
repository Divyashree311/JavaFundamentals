package java8.practice2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumber {
    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,6,7,8).filter(num -> num%2==0)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
