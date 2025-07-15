package practice2.logic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindSumOfTwo {
    public static void main(String[] args) {

        //input 2,7,8,9,5; target = 7, output = 0,4

        int [] input = {2,7,8,9,5,4,3};
        int target = 7;

        //to store sum and index  -> i need a map

        Map<Integer,Integer> map = new LinkedHashMap<>();

        //if you have 1,2,3,4,5 -> target 3, 3-1 = 2 and 3-2 = 1 -> 1+2=3
        //subtract number with target and see if the number exists in memory if so return that number

        //iterate through arrays
        Integer remainder=0;
        for(int i = 0; i<input.length;i++){
            remainder = target - input[i];
            if(map.containsKey(remainder)) {
                System.out.println("Index are: " +map.get(remainder)+":" + i + "  and numbers are " +
                        + remainder
                + " & " + input[i]);
            }
            map.put(input[i], i);

        }



    }
}
