package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesUsingSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.addAll(Arrays.asList(1,2,2,3,4));


        System.out.println("SHOWS DUPLICATES: " + numbers);





    }
}
