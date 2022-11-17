package collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();

        names.add("Divya");
        names.add("Nisarga");
        names.add("Krishna");
        names.add("Kumari Nataraj");

        for (String s: names){
            System.out.println(s);
        }

        names.removeFirst();
        names.removeLast();
        //names.pop(); ->  removes first element from the stack and returns the first element of this list.
       // names.poll(); -> Retrieves and removes the head (first element) of this list
       //poll() returns null if the list is empty, and pop() (and removeFirst()) raises a NoSuchElementException

      //  names.peek(); ->  Retrieves, but does not remove, the head (first element) of this list

        System.out.println("-------------------------------------------------------");


        for (String s: names){
            System.out.println(s);
        }

        names.addFirst("Divya");
        names.addLast("KN");

        System.out.println("-------------------------------------------------------");

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
