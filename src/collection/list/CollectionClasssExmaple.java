package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClasssExmaple {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(0);

        //add all
        Collections.addAll(list, 8);
        System.out.println("--------------SORT--------------------");


        //sort
        Collections.sort(list);

        for (Object lists : list) {
            System.out.println(lists);
        }

        System.out.println("*******************REVERSE ORDER************************");


        //sort in reverse order
        Collections.sort(list, Collections.reverseOrder());

        for (Object listReverse : list) {
            System.out.println(listReverse);
        }

        //binarysearch
        //first we should arrange in ascending order or else result would be wrong
        //returns position of the element
        //if element doesn't exists it returns -1/-2 etc., where element should have been present

        System.out.println("--------------Search--------------------");

        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 7));
        System.out.println(Collections.binarySearch(list, 5));
        System.out.println(Collections.binarySearch(list, 1));
        System.out.println(Collections.binarySearch(list, 0));

        //Copy: To copy from one list to another list

        List<Integer> num = new ArrayList<>();
        num.add(5);

        Collections.copy(list, num);

        System.out.println("--------------Copy--------------------");
        for (Object lists : list) {
            System.out.println(lists);
        }


    }
}
