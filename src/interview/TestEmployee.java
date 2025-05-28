package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {

        List<Employees> list = new ArrayList<>();

        list.add(new Employees("Divya", 1000));
        list.add(new Employees("Kavana", 2000));
        list.add(new Employees("Kavya", 100));
        list.add(new Employees("shwetha", 400));


        list.stream()
                .filter(emp -> emp.getSalary() > 500 && emp.getSalary() <3000)
                .sorted((i1,i2) -> i2.getSalary() - i1.getSalary())
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));


    }
}
