package java8.practice2;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "Java is fun";

     String res =   Arrays.stream(name.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(res);

      StringBuffer name2 =  new StringBuffer(name).reverse();
        System.out.println(name2);


    }
}
