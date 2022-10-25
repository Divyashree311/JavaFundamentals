package objectmethods;

import java.util.Objects;

public class StudentRegistration {
    private int studentId;
    private int age;
    private String studentName;
    private int admissionNumber;
    private static int count=1000;

     void  generateStudentId(){
        System.out.println("Student details: \nStudent name: " + getStudentName()+ "\nAdmission number: " + getAdmissionNumber()
                + "\nRollNumber: " + getStudentId());

    }

    @Override
    public int hashCode() {

        return this.admissionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        StudentRegistration that = (StudentRegistration) o;
        if (that.admissionNumber == this.admissionNumber && that.studentName == this.studentName){
            return true;
        }else {
            generateStudentId();
            return false;
        }
    }

    public StudentRegistration(int age, String studentName, int admissionNumber) {
        ++count;
        this.age = age;
        this.studentName = studentName;
        this.admissionNumber = admissionNumber;

    }

    public int getStudentId() {
        studentId = count;
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public static void main(String[] args) {
        StudentRegistration studentRegistration = new StudentRegistration(24,"Divya",5003);
        StudentRegistration studentRegistration2 = new StudentRegistration(22,"Diya",5003);
        if(studentRegistration.equals(studentRegistration2)){
            System.out.println("Student already present");
        }

    }

}
