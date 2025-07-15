package java8.practice2;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInList {
    public static void main(String[] args) {
        String input = "Java is fun really";
     String word =   Arrays.stream(input.split(" "))
                .max(Comparator.comparing(String::length)).get();

        System.out.println(word);

        //nth longest
   String nth =     Arrays.stream(input.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse(" ");

        System.out.println(nth + " length " + nth.length() );

    }
}
