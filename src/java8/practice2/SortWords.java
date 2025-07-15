package java8.practice2;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortWords {
    public static void main(String[] args) {


        //asc
        System.out.println("Printing word in asc order ");
        Stream.of("Apple","Animal","Banana","Avacado")
                .sorted().collect(Collectors.toList())
                .forEach(s -> {
                    System.out.println(s);
                });

        //desc
        System.out.println("Printing word in desc order ");
        Stream.of("Apple","Animal","Banana","Avacado")
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList())
                .forEach(s -> {
                    System.out.println( s);
                });


    }
}
