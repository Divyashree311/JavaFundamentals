package interview2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program1 {

    public static void main(String[] args) {

        int number = 12332352;

        List<Integer> list = new ArrayList<>();

        int mod = 0;
        int div = 0;
        //number =123
        //modu = 3, div = 12
        //number = div, mod = 2, div =1

        while (number>=1){
            mod = number%10;
            System.out.println(mod);
            list.add(mod);
            div = number/10;
            System.out.println(div);
            number = div;
            System.out.println(number);
        }

        System.out.println("list: " + list);

         list.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
            .forEach((k,v) -> System.out.println(k + ":" + v));




    }

}
