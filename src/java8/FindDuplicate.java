package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,2,4);
        Set<Integer> set= new HashSet<>();

        list.stream().filter(a -> !set.add(a)).collect(Collectors.toSet()).forEach(s -> System.out.println(s));
    }
}
