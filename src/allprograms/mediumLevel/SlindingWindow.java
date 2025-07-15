package allprograms.mediumLevel;

import java.util.HashSet;
import java.util.Set;

public class SlindingWindow {
    public static void main(String[] args) {

        String input = "abcabcbb";

        int start = 0;
        int end = 0;
        int maxChar =0;
        int maxLenthSoFar = 0;
        Set<Character> seen = new HashSet<>();
        while(end<input.length()){
            char ch = input.charAt(end);

            if(!seen.contains(ch)){
                seen.add(ch);
                end++;

                if((end-start) > maxLenthSoFar){

                    maxLenthSoFar = (end-start);
                    maxChar = start;

                }

            }else{
                seen.remove(input.charAt(start));
                start++;
            }

        }
        System.out.println("max so far " + input.substring(maxChar,maxLenthSoFar));
        System.out.println("MAX LENGTH "+ maxLenthSoFar + " " + maxChar);

    }



}
