package interfaceexample;

public class Intern implements DataProvider{

    int securedMarks;
    int graceMarks;

    public Intern(int securedMarks, int graceMarks) {
        this.securedMarks = securedMarks;
        this.graceMarks = graceMarks;
    }

    @Override
    public void calculatePercentage() {
       int interMarks = securedMarks + graceMarks;
       if(interMarks<8000){
           double percentage = (interMarks*100)/totalMaximumMarks;
           System.out.println("Intern percentage is " + percentage);
       }else {
           System.out.println("Enter correct marks");
       }

    }
}
