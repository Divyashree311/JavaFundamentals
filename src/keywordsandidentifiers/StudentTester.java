package keywordsandidentifiers;

public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(101);
        student.setName("Divya");
        student.setMarks(567);
        student.setGrade('A');
        System.out.println("Student name : " + student.getName());
        System.out.println("Student ID : " + student.getStudentId());
        System.out.println("Student marks : " + student.getMarks());
        System.out.println("Student garde : " + student.getGrade());

    }
}
