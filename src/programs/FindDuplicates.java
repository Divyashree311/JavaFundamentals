package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = {11,22,11,3,44,55,22,3};

        Set<Integer> numbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i=0; i<=arr.length-1;i++){
            if(!numbers.add(arr[i])){
                duplicates.add(arr[i]);
            }
        }

        System.out.println("Duplicates are  " + duplicates);



    }

}
