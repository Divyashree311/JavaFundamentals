package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsOne {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1);
        Set<Integer> res;

        //Filter, remove duplicates and count
        res = list.stream().filter(i -> i < 3).collect(Collectors.toSet());
        System.out.println(res);
        long a = list.stream().filter(i -> i < 3).collect(Collectors.toSet()).stream().count();//.forEach(a -> System.out.println(a));
        System.out.println(a);

        //sort them -> natural
        res.stream().sorted().forEach(c -> System.out.println(c));
        //custom sorting
        res.stream().sorted((b1,b2) -> b2.compareTo(b1)).forEach(s-> System.out.println(s));
     long t=   res.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(t);


        //covert to streams
       Stream<Integer> integers= Stream.of(1,2,3,4);

    list.stream().filter(i -> i%2==0).map(p -> p+2).filter(i -> i> 5).forEach(o -> System.out.println(o));

    }
}