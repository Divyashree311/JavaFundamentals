package allprograms.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prg9FindMaxAndMin {
    public static void main(String[] args) {

        List< Integer> list = Arrays.asList(1,4,3,2,9,4,5);

        int max =        list.stream().distinct()
                        .max(Comparator.naturalOrder())
                        .get();

        System.out.println(max);

        System.out.println("Nth max");
        int n = 2;
           list.stream().distinct()
                        .sorted((a,b) -> b.compareTo(a))
                        .skip(n-1)
                        .findFirst()
                                .ifPresentOrElse(
                                        val -> System.out.println("Nth max " + val),
                                        () -> System.out.println("Number is not valid")
                                );

    //    System.out.println(nth);

    }
}
