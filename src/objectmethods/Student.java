package objectmethods;

import java.util.Objects;

public class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }


    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public boolean equals(Object o) {
         if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(studentName, student.studentName);

        /*
        Other way
                Student student = (Student) o;
                if(this.hashCode() == student.hashCode()){
                return this.studentId.equals(student.studentId);
                }
                return false;

         */
    }

    public static void main(String[] args) {
        Student student = new Student(111,"Divya");
        Student student2 = new Student(11,"Divya"); // Sid changes objects aren't equal. Two different objects.

        if (student.equals(student2)){
            System.out.println("Objects are equal");
        }else{
            System.out.println("Objects are not equal");
        }

    }
}
