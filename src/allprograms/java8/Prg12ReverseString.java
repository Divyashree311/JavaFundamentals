package allprograms.java8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg12ReverseString {
    public static void main(String[] args) {

        String[] name = "Divya is happy".split(" ");

        Stream.of(name)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));



    }




    }


