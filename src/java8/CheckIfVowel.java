package java8;

import java.util.Arrays;
import java.util.List;

public class CheckIfVowel {

    public static void main(String[] args) {

        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        String name = "Divya";
        name = name.toLowerCase();

        name.chars()
                .mapToObj(c -> (char) c)
                .filter(c-> "aeiou".indexOf(c) != -1) // index of first occurance if it's found, -1 not found
                .count();




    }
}
