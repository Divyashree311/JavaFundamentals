package java8.practice2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountTheOccurance {
    public static void main(String[] args) {
        String[] input = "Java is fun and java is simple".toLowerCase().split(" ");

        System.out.println("To print the occurance of words");
    Map<String,Long> freq =   Stream.of(input)
                .collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()));

        System.out.println(freq);

        System.out.println("\nTo find the maximun occurance ");

        Map.Entry<String,Long> map =     Stream.of(input)
                .collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .findFirst()
                .get();
        System.out.println(map);


        //To find all  maximum

    long maxFreq =    freq.values()
                .stream()
            .mapToLong(Long::longValue)
                .max()
                .orElse(0);

        System.out.println("MaxFreq: " + maxFreq);

        freq.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxFreq)
                .forEach(s -> System.out.println("All maximum:  " + s));


        //To find the nth max
        int n = 2;

        long nthMax =   freq.values()
                .stream()
                .mapToLong(Long::longValue)
                .sorted()
                .skip(n-1)
                .findFirst().orElse(0);

                freq.entrySet()
                        .stream()
                        .filter(entrt -> entrt.getValue() == nthMax)
                        .forEach(s -> System.out.println("Nth max " + s));


    }
}
