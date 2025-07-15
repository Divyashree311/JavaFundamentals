package programs.practice;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSoFar = input[0];
        int currentMax = input[0];

        for(int i =1;i<input.length;i++){
                currentMax =    Math.max(input[i],  currentMax + input[i]);//sum of the current sub array
                maxSoFar = Math.max(currentMax,maxSoFar);
        }

        System.out.println(maxSoFar);






    }
}
