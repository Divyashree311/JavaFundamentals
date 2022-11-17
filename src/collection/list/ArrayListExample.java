package collection.list;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(new Integer(4));
        list.add(8);

        System.out.println(list);

        System.out.println("Iterating using for loop");

        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        System.out.println("Iterating using for each loop");
        for (Integer i : list){
            System.out.println(i);
        }

        System.out.println("Iterating using iterator");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);
        }

    }

}
