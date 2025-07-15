package java8.practice2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepetativeChar {
    public static void main(String[] args) {
        String input = "Java".toLowerCase();

        //Non repeatative
        input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(let -> let, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .forEach(System.out::println);

        //First non repeatatative

   Map.Entry<Character, Long> op = input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(let -> let, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .get();

        System.out.println("First non repetitive " + op);
    }
}
