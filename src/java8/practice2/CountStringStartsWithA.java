package java8.practice2;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountStringStartsWithA {
    public static void main(String[] args) {
        //Word starting with A
      Stream.of("Apple","Animal","Banana","Avacado")
                .filter(word -> word.startsWith("A"))
              .collect(Collectors.toList())
              .forEach(s -> System.out.println(s)) ;

      //count characters in your name : Divyashree K N
        String name = "Divyashree K N";
        name = name.toLowerCase();

        name.chars()
                .mapToObj(ch -> (char) ch)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(letter -> letter, LinkedHashMap::new, Collectors.counting()))
                .forEach((k,v) -> System.out.println( k + " -> " + v));

        //Find duplicates in my name
        name.chars()
                .mapToObj(ch -> (char) ch)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(letter -> letter, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));

        //find duplicate index

        String name2 ="DIVYshree K N".toLowerCase();

       IntStream.range(0, name2.length()) //generate a stream of int from o to name-1 of length
               .boxed() //converted IntStream (int) to Stream<Integer>
               .filter(i -> Character.isLetter(name2.charAt(i)))
               .collect(Collectors.groupingBy(ind -> name2.charAt((Integer) ind),LinkedHashMap::new
                       ,Collectors.toList()))
               .entrySet()
               .stream()
               .filter(entry -> entry.getValue().size() > 1)
               .forEach(s -> System.out.println("Index " + s));


       IntStream.range(0, name2.length())
               .boxed()
               .filter(check -> Character.isLetter(name2.charAt(check)))
               .collect(Collectors.groupingBy(
                       i -> name2.charAt(i), LinkedHashMap::new,
                       Collectors.toList()
               ))
               .entrySet()
               .stream()
               .filter(entry -> entry.getValue().size() > 1)
               .forEach(s -> System.out.println("Index of duplicate " + s));

    }
}
