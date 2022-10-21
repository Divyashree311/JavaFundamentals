package enumexample;

public enum Grades {
        A,B,C,D,E;
}

class Student{
    private int studentId;
    private String studentName;
    private Grades grade;
    private int totalMarks;
    private int scholarshipAmount;

    public void calculateGrade(){
        if(totalMarks >= 250){
            grade = Grades.A;
        } else if (totalMarks > 199 && totalMarks <250) {
            grade = Grades.B;
        } else if (totalMarks > 174 && totalMarks <200) {
            grade = Grades.C;
        } else if (totalMarks > 149 && totalMarks < 175) {
            grade = Grades.D;
        } else {
            grade = Grades.E;
        }
    }

    public void calculateScholarshipAmount(){
        switch (grade){
            case A :
                scholarshipAmount = 5000;
                break;
            case B:
                scholarshipAmount = 4000;
                break;
            case C:
                scholarshipAmount = 3000;
                break;
            case D:
                scholarshipAmount = 2000;
                break;
            case E:
                scholarshipAmount = 0;
                System.out.println("No scholarship amount for grade E");
                break;
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Grades getGrade() {
        return grade;
    }

    public void setGrade(Grades grade) {
        this.grade = grade;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void setScholarshipAmount(int scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }
}
