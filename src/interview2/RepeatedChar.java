package interview2;

import java.util.stream.Collectors;

public class RepeatedChar {

    public static void main(String[] args) {

        String name = "Divyashree";


        name.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(let -> let, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(System.out::println);



    }
}
