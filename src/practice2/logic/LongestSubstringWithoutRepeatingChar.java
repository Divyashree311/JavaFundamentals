package practice2.logic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {

        String input = "abcabcbb";

        //a -> b -> c -> a (X) -> len  3
        //b -> c -> a -> b (X) -> len 3

        //Get max from below after each check
        int maxSoFar = 0;
        int currentMax = 0;
        Set<Character> set = new LinkedHashSet<>();
        for(int pointer = 0; pointer<input.length();pointer++){

           char getChar = input.charAt(pointer);
            System.out.println("getChar: " + getChar);
           //check if charcter is in the list
            while(set.contains(getChar)){
                set.remove(input.charAt(pointer));
                System.out.println("remove: "+ input.charAt(pointer));
                System.out.println("before " + pointer);
                pointer++;
                System.out.println("Pointer " + pointer);
            }

            set.add(getChar);

            System.out.println("set "+ set);

        }

    }

}
