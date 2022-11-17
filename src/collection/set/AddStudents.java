package collection.set;

import java.util.HashSet;

public class AddStudents {
    public static void main(String[] args) {
        Student student1 = new Student("Divya", 101);
        Student student2 = new Student("Kavya", 989);
        Student student3 = new Student("Kavya", 99);
        Student student4 = new Student("Div", 99);

        HashSet<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student3);

        for (Student s: students){
            System.out.println(s);
        }

    }
}
