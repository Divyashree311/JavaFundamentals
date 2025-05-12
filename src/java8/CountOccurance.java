package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurance {
    public static void main(String[] args) {
        String input = "Java is fun and Java is simple";
        List<String>  list = Arrays.asList(input.split(" "));

   Map<String, Long> res=  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(res);
    }
}
