package practice2.logic;

import java.util.*;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] input = {0,1,2,3,5,7,10};

        int len = input.length;

        int formula = len * (len+1)/2; // if it has zero
        int formula2 = (len*1) *(len*2)/2;//if it starts with 1
        int sum = 0;
        for(int i = 0; i<input.length;i++){
            sum = sum+input[i];
        }
        int missingNum = (formula-sum);
   //     System.out.println(missingNum);

        //my approach - 1 didn't work
         //First i will sort and get the first digit
        Arrays.sort(input);
        int start = input[0];
        int end = input[input.length-1];

        List<Integer> list = new ArrayList<>();
        List<Integer> missList = new ArrayList<>();

        for(int num: input){
            list.add(num);
        }

        for (int i = start; i<=end;i++){
            if(!list.contains(i)){
                missList.add(i);
            }
        }

        System.out.println(missList);
    }
}
