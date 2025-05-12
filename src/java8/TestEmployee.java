package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
        //Given the emp list, sort the employee based on sal in desc order
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Div", 1355));
        emp.add(new Employee(2,"Divya", 1236));
        emp.add(new Employee(3,"Kavya", 98765));
        System.out.println("DESC salary");
     List<Employee> des =   emp.stream().sorted((e1,e2) -> (int) (e2.getSalary() - e1.getSalary())).collect(Collectors.toList());
        System.out.println(des);

        System.out.println("ASC salary");
        List<Employee> asc =   emp.stream().sorted((e1,e2) -> (int) (e1.getSalary() - e2.getSalary())).collect(Collectors.toList());
        System.out.println(asc);

        System.out.println("Fetch highest two salary");
        List<Employee> lim = des.stream().limit(2).collect(Collectors.toList());
        System.out.println(lim);
    }
}
