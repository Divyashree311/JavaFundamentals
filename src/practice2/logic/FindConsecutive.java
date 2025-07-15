package practice2.logic;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindConsecutive {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");
        String letters = "ABAACDBCABACABDCBAC";

        String combinations="";

        Set<String> set = new LinkedHashSet<>();
        for(int i = 0; i<letters.length()-2;i++){
         combinations =   letters.substring(i,i+3);// 0 to 3, 1 to 4th index
            if(list.contains(combinations)) {
                set.add(combinations);
            }
        }

        System.out.println(set);
    }
}
