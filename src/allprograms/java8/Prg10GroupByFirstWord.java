package allprograms.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg10GroupByFirstWord {
    public static void main(String[] args) {

        Stream.of("Hi","Hello","No","Yes","Nothing")
                .collect(Collectors.groupingBy(s ->  s.charAt(0)))
                .forEach((k,v) -> System.out.println(k + ":" + v));


    }
}
