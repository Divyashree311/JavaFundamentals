package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Divya");
        names.add("Nisarga");
        names.add("Krishna");
        names.add("Kumari Nataraj");

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collections.reverse(names);

        System.out.println("-------------------------------------------------------");
        ListIterator<String> iterators = names.listIterator();

        while (iterators.hasNext()){
            System.out.println(iterators.next());
        }


    }
}
