package collection.map;

public class Student {
    private String name;
    private int rollNo;
    private int marks;
    private char grade;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public char calculateGrade(){
        if(getMarks() >= 60){
            setGrade('A');
        } else if (getMarks() < 60 && getMarks() >40) {
            setGrade('B');
        } else if (getMarks() <= 40) {
            setGrade('C');
        }

        return grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return calculateGrade();
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
