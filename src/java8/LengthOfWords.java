package java8;

import java.util.List;
import java.util.stream.Stream;

public class LengthOfWords {

    public static void main(String[] args) {

        Stream.of("Divya","Rahul","Amma","Appa").map( word -> word + ":" + word.length())
                .forEach(s -> System.out.println(s));

    }
}
