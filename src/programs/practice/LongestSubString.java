package programs.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String word ="abcabcbb";

        Set<Character> set = new HashSet<>();
        //to find longest sub string without repeating

        //pointer, moves words until it finds duplicate, found duplicate? increase pointer and move forward
        int start = 0;
     //   int end = 0;

        int maxSoFar =0;

    for (int end = 0; end<word.length();end++) {

                char c=    word.charAt(end);

                while (set.contains(c)){
                    set.remove(word.charAt(start));
                    start++;
                }
                set.add(c);
                maxSoFar = Math.max(maxSoFar, end-start+1);


    }
        System.out.println(maxSoFar);
    }
}
