package controlstatements;

public class ForEachExample {

    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.storeMarks();
        studentMarks.displayMarks();
    }
}

class StudentMarks{
    int[] marks = new int[5];

    public void storeMarks(){
            marks[0] = 20;
            marks[1] = 30;
            marks[2] = 40;
            marks[3] = 35;
            marks[4] = 48;
    }

    public void displayMarks(){
        for (int scores: marks){
            System.out.println(scores);
        }
    }

}
