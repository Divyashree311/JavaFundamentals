package allprograms.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg19MergeTwoListAndRemoveDuplicates {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Box","Of","Apples");
        List<String> list2 = Arrays.asList("Of","Applees");

        Stream.concat(list1.stream(),list2.stream())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Find common elements");

        list1.stream().filter(list2::contains)
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
}
