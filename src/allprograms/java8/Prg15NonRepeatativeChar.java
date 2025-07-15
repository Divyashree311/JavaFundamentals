package allprograms.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Prg15NonRepeatativeChar {
    public static void main(String[] args) {
        String input = "Java".toLowerCase();

        input.chars()
                .mapToObj(c -> (char)c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(let -> let, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() ==1)
                .limit(1)
                .forEach(System.out::println);

    }
}
