package allprograms.java8;

import java.util.Arrays;
import java.util.List;

public class Prg2SumAndProduct {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum of given numbers");

       int sum =     list.stream()
                    .reduce(0, (a,b) -> a+b);


        System.out.println(sum);

        System.out.println("Multiply all the numbers");

        int multiply=   list.stream()
                            .reduce(1,(a,b) -> a*b);

        System.out.println(multiply);

    }
}
