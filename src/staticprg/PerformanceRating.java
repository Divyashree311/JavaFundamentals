package staticprg;

public class PerformanceRating {
    private final int outStanding = 5;
    private final int good = 4;
    private final int average = 3;
    private final int poor = 2;

    static int calculatePerformance(Employee employee){
        PerformanceRating performanceRating = new PerformanceRating();
        int rating = 0;
        if(employee.getPoint() >= 80 && employee.getPoint() <= 100 ){
            rating = performanceRating.outStanding;
        } else if (employee.getPoint() >= 60 && employee.getPoint() < 80 ){
            rating = performanceRating.good;
        } else if (employee.getPoint() >= 50 && employee.getPoint() < 60 ){
            rating = performanceRating.average;
        } else if (employee.getPoint() >= 1 && employee.getPoint() < 50 ){
            rating= performanceRating.poor;
        }
        return rating;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setPoint(10);
        System.out.println("Emp 1, point 10 " + calculatePerformance(employee));

        Employee employee2 = new Employee();
        employee2.setPoint(89);
        System.out.println("Emp 2 with point 89 " + calculatePerformance(employee2));


    }
}
