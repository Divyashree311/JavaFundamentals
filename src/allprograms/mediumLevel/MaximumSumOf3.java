package allprograms.mediumLevel;

public class MaximumSumOf3 {
    public static void main(String[] args) {

        int[] arr = {1,4,5,7,3,4,9};
        int firstSum=0;
        int maxSoFar=0;
        int maxSum = 2;

        for(int i=0;i<maxSum;i++){

                firstSum = firstSum + arr[i];


        }

        maxSoFar = firstSum;

        System.out.println(firstSum);


        //start from 3,
        for(int i = maxSum; i<arr.length;i++){

            firstSum = firstSum + arr[i] - arr[i-maxSum]; // arr[3-3], arr[4-3]

            maxSoFar = Math.max(firstSum,maxSoFar);

        }


        System.out.println("-------------------------------------------------"+maxSoFar);
    }
}
