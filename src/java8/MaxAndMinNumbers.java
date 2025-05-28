package java8;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxAndMinNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,2,6,8,2,0);
     int min =   list.stream().distinct().sorted().findFirst().get();
        System.out.println(min);

       int max = list.stream().distinct().sorted((i1,i2) -> i2.compareTo(i1)).findFirst().get();
        System.out.println(max);

      int max2 =   list.stream().max(Integer::compare).get();
        System.out.println(max2);

        int max3 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max3);

//        max3.ifPresentOrElse(val -> System.out.println("Nth max is " + val),
//                () -> System.out.println("not enough elements"));
    }
}
