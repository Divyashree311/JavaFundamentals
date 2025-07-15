package allprograms.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prg22FindPalindrome {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","madam","nayan","mayem");

        list.stream()
                .filter(word ->word.equals(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
