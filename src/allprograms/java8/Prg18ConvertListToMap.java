package allprograms.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prg18ConvertListToMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Box","Of","Apples");

        list.stream()
                .collect(Collectors.toMap(word -> word,word -> word.length()))
                .forEach((k,v) -> System.out.println(k+":"+v));

    }
}
