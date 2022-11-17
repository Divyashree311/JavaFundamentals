package collection.map;

import java.util.Map;
import java.util.TreeMap;

import static java.util.Map.*;

public class StoreData {
    public static void main(String[] args) {

        Student student1 = new Student("Divya",79,80);
        Student student2 = new Student("Kav",89,40);


        TreeMap<Integer,Character> map = new TreeMap<>();
        map.put(student1.getRollNo(),student1.getGrade());
        map.put(student2.getRollNo(),student2.getGrade());

        System.out.println(map);

        for (Map.Entry e : map.entrySet()){
            System.out.println("Key : " + e.getKey() + " Value :  " +  e.getValue());
        }


    }
    
}
