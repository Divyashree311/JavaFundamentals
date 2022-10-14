package Programs;

/*
Armstrong number is a number which is sum of cube of the given digits.
example, given number is 123 --> (1)cube + (2) cube + (3) cube = 1+8+27=36
36 is armstrong number.
 */
public class ArmstrongNumber {
    public static void main(String[] args) {

        //Let's think about logic
        //take separate digit like 1 once, 2 and then 3 or 3,2,1
        //multiply each digit with itself thrice
        //store result and add all 3

        int number = 123;
        int sum=0;
        while (number != 0){
            int reminder = number % 10;
            reminder = reminder*reminder*reminder;
            sum = sum + reminder;
            number = number / 10;
        }
        System.out.println("Armstrong number is " + sum);


    }
}
