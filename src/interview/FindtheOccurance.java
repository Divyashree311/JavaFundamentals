package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindtheOccurance {

    public static void main(String[] args) {

       List<String> list = Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");
        Set<String> set = new HashSet<>();
        String letters = "ABAACDBCABACABDCBAC";

            for(int i = 0; i<letters.length()-2;i++){
               String permutaion = letters.substring(i,i+3);
            //    System.out.println("Combinations we got  from the given list before: " +permutaion);

                if(list.contains(permutaion)){
                    set.add(permutaion);
                }


            }

        System.out.println(set);

    }
}
