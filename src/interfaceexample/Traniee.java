package interfaceexample;

public class Traniee implements DataProvider{

    int securedMarks;

    public Traniee(int securedMarks) {
        this.securedMarks = securedMarks;
    }

    @Override
    public void calculatePercentage() {
        double percentage = (securedMarks*100)/totalMaximumMarks;
        System.out.println("Trainee percentage is " + percentage);
    }
}
