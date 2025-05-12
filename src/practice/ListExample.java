package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(31);
        numbers.add(21);

        for(Integer getNum: numbers){
            System.out.println(getNum);
        }

        for (int i = 0; i<numbers.size(); i++){
            System.out.println("Using for: " +  numbers.get(i));
        }

        Iterator<Integer> iterable = numbers.iterator();
        while (iterable.hasNext()){
            Integer o = iterable.next();
            System.out.println(o);

        }


    }
}
