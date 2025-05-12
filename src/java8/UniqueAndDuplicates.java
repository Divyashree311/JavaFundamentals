package java8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueAndDuplicates {

    public static void main(String[] args) {

        List<Integer> num;
        Set set = new HashSet<>();
        //Unique elements
         num=  Stream.of(1,2,3,4,4,0,6,1).distinct().collect(Collectors.toList());
             //   .forEach(s -> System.out.println( "Unique elements: " + s)); //prints line by line
        System.out.println("Unique elements: " + num);

        //Duplicates
        num =   Stream.of(1,2,3,4,4,0,6,1).filter(ele -> !set.add(ele)).collect(Collectors.toList());
        System.out.println("Duplicates elements: " + num);

        //forEach( p-> System.out.println("Duplicate" +
                //"elements : " + p));

    }
}
