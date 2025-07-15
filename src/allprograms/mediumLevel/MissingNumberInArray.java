package allprograms.mediumLevel;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {

        //formula to calculate the missing number
        //expected = n*(n+1)/2, actual = sum of all ,missing = ex-act


        int[] numbers  = {0,3,1,2,5};
        int length = numbers.length;

        int formula = length *(length+1)/2;

        int sumOfAllNumbers = 0;

        for (int i =0; i<numbers.length;i++){
            sumOfAllNumbers = sumOfAllNumbers + numbers[i];
        }

        System.out.println("Missing number is: "+ (formula - sumOfAllNumbers));



    }
}
