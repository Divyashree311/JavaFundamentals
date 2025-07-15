package java8.practice2;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupWordBythereFirstCharacter {

    public static void main(String[] args) {

        Stream.of("Apple","Animal","Banana","Avacado","Biscuit")
                .collect(Collectors.groupingBy(
                        word -> word.charAt(0), LinkedHashMap::new,
                        Collectors.toList()
                ))
                .forEach((k,v)-> System.out.println(
                        k + ":" + v
                ));

    }
}
