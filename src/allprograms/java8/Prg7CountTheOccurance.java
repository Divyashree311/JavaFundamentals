package allprograms.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Prg7CountTheOccurance {

    public static void main(String[] args) {

        String[] input = "Java is fun and java is simple".split(" ");

        Arrays.stream(input)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + ":" + v));

        System.out.println("print max occurance");
          Map<String,Long> map =   Arrays.stream(input)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        Optional<Map.Entry<String,Long>> maxFreq=    map.entrySet().stream()
                                    .max(Map.Entry.comparingByValue());

        System.out.println(maxFreq);

        System.out.println("Using sorted");
        Map.Entry<String,Long> usingSort =  map.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .findFirst().orElse(null);

        System.out.println(usingSort);

        System.out.println("Using sorted nth max");
            int n=2;
          List list =  map.values().stream()
                    .sorted(Comparator.reverseOrder())
                    .skip(n-1)
                    .collect(Collectors.toList());

        System.out.println("List: " +list);

    Long fre =    map.values().stream()
     //       .mapToLong(Long::longValue)
                .sorted(Comparator.reverseOrder())
                .skip(n-1)
                .findFirst().orElse(null);
        System.out.println("Freq: " + fre);

    Map<String,Long> nthMap =    map.entrySet().stream()
                .filter( entry -> entry.getValue() == fre)
                .collect( Collectors.toMap(
                       Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println(nthMap);






    }

}
