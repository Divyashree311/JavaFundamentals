package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccuranceCharacter {
    public static void main(String[] args) {

        String input = "Java is fun and java is simple and java is WORA";
        String[] inputChar =  input.split(" ");

        //count occurance of the character

     Map<String,Long> map = Stream.of(inputChar)
                            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(map);

     //count the letters in the word
   List<String> charCount = Stream.of(inputChar)
             .map( word -> word + ": " + word.length()).collect(Collectors.toList());

        System.out.println(charCount);

   //occurance of character

   Map<Character, Long> countChar =        input.chars()
                    .mapToObj(c ->(char) c)
           .filter(Character::isLetter)
                    .collect(Collectors.groupingBy(
                            letter -> letter,
                            Collectors.counting()
                    ));

        System.out.println(countChar);

       input.chars()
                .mapToObj(c ->(char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(
                        letter -> letter,
                        Collectors.counting()
                ))
               .forEach((ch,count) -> System.out.println(ch +":" + count));

    }
}
