package arrays;

/*
Program to calculate average salary of employee and count salary greater and lesser than average salary
 */

public class EmployeeRecords {
    public static void main(String[] args) {
        double salary[] = {23500.0, 25000.0, 26000.0,27000.0,28000.0};
        int sum = 0;
        int average = 0;
        int countGreaterThanAverage = 0;
        int countLesserThanAverage = 0;
        for (double var: salary){
            sum += var;
        }
        average = sum/5;
        System.out.println("Sum of 5 Employee salary is : " + sum);
        System.out.println("The average salary of the employee is : " + average);

        for (double var: salary){
            if (var > average){
                countGreaterThanAverage++;
            }else {
                countLesserThanAverage++;
            }
        }

        System.out.println("The number of employee having salary greater than the average is : " + countGreaterThanAverage);
        System.out.println("The number of employee having salary lesser than the average is : " + countLesserThanAverage);


    }
}
