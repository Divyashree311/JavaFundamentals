package allprograms.basiclevel;

import java.util.*;

public class FindConsecutiveOccurance {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");
        String letters = "ABAACDBCABACABDCBAC";
        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i<letters.length()-2;i++){
                String subStrings =    letters.substring(i,i+3);
                if(list.contains(subStrings)){
                    set.add(subStrings);
                }

        }

        System.out.println(set);


    }
}
