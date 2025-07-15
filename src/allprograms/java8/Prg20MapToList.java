package allprograms.java8;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Prg20MapToList {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("Divya",1,"Halesh",2);

        new ArrayList<>(map.entrySet())
                .forEach(System.out::println);
    }
}
