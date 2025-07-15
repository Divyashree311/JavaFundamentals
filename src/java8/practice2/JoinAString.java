package java8.practice2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinAString {

    public static void main(String[] args) {
       String s = Stream.of("Java","is","fun")
                .collect(Collectors.joining(","))
               .replace("," ," ");
       System.out.println(s);



    }
}
