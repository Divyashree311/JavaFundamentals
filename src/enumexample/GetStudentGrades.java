package enumexample;

public class GetStudentGrades {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1000);
        student.setStudentName("Divya");
        student.setTotalMarks(280);
        student.calculateGrade();
        student.calculateScholarshipAmount();

        System.out.println("Student details: \nID: " + student.getStudentId() + "\nName: " + student.getStudentName() + "\nMarks: " +
                student.getTotalMarks() + "\nGrade: " + student.getGrade() + "\nScholarship: " + student.getScholarshipAmount());
    }
}
