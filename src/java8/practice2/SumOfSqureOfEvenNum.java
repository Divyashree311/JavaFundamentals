package java8.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSqureOfEvenNum {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,57,7);

        //Calculate sum of all

     int num =   list.stream().reduce(0, (a,b) -> a+b);
        System.out.println("Sum of number is " + num);

        //sum of square of even numbers

    int sum=    list.stream()
                .filter(a -> a%2==0)
                .map(b -> b*b)
                .reduce(0,(a,b) -> a+b);
//                .collect(Collectors.toList())
//                .forEach(s -> System.out.println("Sqaure of even numbers " + s));

        System.out.println("Sum of square of the even numbers " + sum);

    }
}
