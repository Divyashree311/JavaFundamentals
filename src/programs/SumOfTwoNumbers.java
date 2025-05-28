package programs;

import java.util.*;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,2};
        int target = 12;
        int sum=0;
    //    Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<arr.length;i++){

            for (int j = i+1; j<arr.length;j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                 //  map.put(arr[i],arr[j]);
                    System.out.println("Numbers : " + arr[i] + " + " + arr[j] );
                }
            }
        }

      //  System.out.println("Numbers are: " + map);

    }
}
