package allprograms.basiclevel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] number = {1,2,3,2,4};
        Set set = new HashSet<>();

        for (int i = 0;i<number.length;i++){
            if(!set.add(number[i])){
                System.out.println("Duplicate number is " + number[i]);
            }
        }



    }
}
