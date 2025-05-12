package java8;

import java.util.Arrays;
import java.util.List;

public class SumAndProductOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

      int sum =  list.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum);

        int multiple =  list.stream().reduce(1,(a,b) -> a*b);
        System.out.println(multiple);


    }
}
