package java8.practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindMaxAndMin {

    public static void main(String[] args) {

     List<Integer> list =   Arrays.asList(10,24,12,5,78,62);
        System.out.println("\nTo perform the maximum and minimum number operation from the list " + list );

        //find max

     int max =    list.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println("\nMaximin number is: " + max);

     //find minimum

        int min =    list.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println("Minimum number is: " + min);

     //to find nth maximum
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Nth max you want to identify: " );
        int n = scanner.nextInt();
        list.stream()
                    .sorted(Comparator.reverseOrder())
             .skip(n-1)
             .findFirst()
            .ifPresentOrElse(
                    val -> System.out.println("Nth maximum value is " + val + " and Index is: " + list.indexOf(val)),
        () -> System.out.println("No value provided for the n value you have given " + n)
            );


        System.out.println("\nEnter Nth min you want to identify: " );
        int nMin = scanner.nextInt();
        list.stream()
                .sorted(Comparator.naturalOrder())
                .skip(nMin-1)
                .findFirst()
                .ifPresentOrElse(
                        val -> System.out.println("Nth minimum value is " + val + " and Index is: " + list.indexOf(val)),
                        () -> System.out.println("No value provided for the n value you have given " + nMin)
                );




    }
}
