package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1,7); // 1: index 2:element
        list.add(6);
        list.add(10);

        System.out.println("---------Iterating using List iterator------------");

        ListIterator lt = list.listIterator();
        while (lt.hasNext()){
            Object i = lt.next();
            System.out.println(i);
        }

        System.out.println("---------Iterating using for each------------");

        for (Integer i : list){
            System.out.println(i);
        }

        System.out.println("---------Get size------------");

        System.out.println("Size " + list.size());

        System.out.println("---------Iterating using for------------");


        for (int i=0;i<list.size();i++){
            Integer o = list.get(i);
            System.out.println("Index: " + i + " Element: " + o );
        }

        System.out.println("---------Remove index 2 element------------");
        list.remove(2);
        for (Integer i : list){
            System.out.println(i);
        }

        System.out.println("-------------Get element and get List using sout----------------");
        System.out.println("Get 2 index element: " + list.get(2));
        System.out.println("List: " + list);

        System.out.println("----------Update element using index with the help of set--------");
        System.out.println(list.set(2,11));
        System.out.println("Get 2 index element: " + list.get(2));
        System.out.println("List: " + list);

        System.out.println("--------Remove using index or using Object--------------");
        System.out.println(list.remove(1));
        System.out.println(list);

        System.out.println("--------add all is used to add all the elements to the list-------------");

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(20);
        list.addAll(1, list2);
        System.out.println(list);

        System.out.println(list.isEmpty());
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,9));
    }
}
