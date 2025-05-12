package practice2.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountTheOccurance {
    public static void main(String[] args) {
        String input = "Java is my fav lang and java is fun";
        String[] spliltIp= input.split(" ");

     Map<String, Long> map = Stream.of(spliltIp).map(s -> s.toLowerCase())
             .collect( Collectors.groupingBy( Function.identity(), Collectors.counting()) )
        ;

        System.out.println(map);

    }
}
