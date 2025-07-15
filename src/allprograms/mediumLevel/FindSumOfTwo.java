package allprograms.mediumLevel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSumOfTwo {

    public static void main(String[] args) {

        //input 2,7,8,9,5; target = 7, output = 0,4

        int[] input = {2,7,8,5,9};
        int target = 7;
        //logic
        //7-2 = 5 and 7-5 = 2 (5+2==7)
        //after subtracting check if the number exists if does, return it's index

        Map<Integer,Integer> map = new HashMap<>();
        Integer number=0;
        for (int i = 0; i<input.length;i++){
            number = target-input[i];
            if(map.containsKey(number)){
                System.out.println("Index are: "+map.get(number) + ":" + i);
               System.out.println("Numbers: " + input[map.get(number)] + " and " + input[i] );
            }
            map.put(input[i],i);



        }



    }

}
