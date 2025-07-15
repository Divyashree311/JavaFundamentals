package allprograms.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prg4SumOfSquareOfEvenNumber {
    public static void main(String[] args) {

       int sumOfSQaureOfSum = Stream.of(1,2,3,4,5,6)
                .filter(num -> num %2 ==0)
                .map(sq -> sq * sq)
                .peek(s -> System.out.println(s))
                .reduce(0, (n1, n2) -> n1+n2);

        System.out.println("Sum of square of even number and sum if them is: " + sumOfSQaureOfSum);

        System.out.println("To partition even and odd numbers");

  Map<Boolean,List<Integer>> map=  Stream.of(1,2,3,4,5,6)
            .collect(Collectors.partitioningBy(n -> n%2 ==0));

        System.out.println("Even:" + map.get(true));
        System.out.println("Odd:" + map.get(false));



    }
}
