package allprograms.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Prg3TestEmployee {
    public static void main(String[] args) {

        List<Prg3Employee> employees = new ArrayList<>();

        employees.add(new Prg3Employee(1,"Divya",2500000));
        employees.add(new Prg3Employee(2,"DivyaNisarga",3000000));
        employees.add(new Prg3Employee(3,"Nisarga",3500000));
        employees.add(new Prg3Employee(4,"Divy",2400000));


        System.out.println("Filter employees salary greater than 25l and order it in desc order");

        employees.stream()
                .filter(emp -> emp.getSalary() > 2500000)
                .sorted((e1,e2) -> (int) (e2.getSalary() - e1.getSalary()))
                .collect(Collectors.toList())
                .forEach(s -> System.out.println("Id: " + s.getId() + " name " + s.getName()
                + " salary " + s.getSalary()));





    }
}
