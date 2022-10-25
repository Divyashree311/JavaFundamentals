package interfaceexample;

public class Execution {
    public static void main(String[] args) {
        DataProvider dataProvider = new Intern(8000,500);
        dataProvider.calculatePercentage();
        System.out.println("-------------------------------------");

        DataProvider dataProvider1 = new Traniee(6000);
        dataProvider1.calculatePercentage();
        System.out.println("-------------------------------------");

        DataProvider dataProvider3 = new Intern(5000,500);
        dataProvider3.calculatePercentage();

    }
}
