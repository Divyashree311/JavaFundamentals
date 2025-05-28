package interview;

import java.lang.reflect.Array;
import java.util.*;

public class LinkedListTest {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> res = new ArrayList<>();

        res.add(list.get(0));
        res.add(list.get(1));

        List<Integer> subList = list.subList(2,5);
        Collections.reverse(subList);
        res.addAll(subList);
        res.add(list.get(5));
        res.add(list.get(6));

        System.out.println(res);

    }
}
