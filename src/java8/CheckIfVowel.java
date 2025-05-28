package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckIfVowel {

    public static void main(String[] args) {

        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        String name = "Divya";
        name = name.toLowerCase();

      long count=  name.chars()
                .mapToObj(c -> (char) c)
                .filter(c-> "aeiou".indexOf(c) != -1) // index of first occurance if it's found, -1 not found
              .count();

        System.out.println(count);

        name.chars()
                .mapToObj(c -> (char) c)
                .filter(c-> "aeiou".indexOf(c) != -1) // index of first occurance if it's found, -1 not found
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));




    }
}
