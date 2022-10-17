package programs;

import java.util.LinkedList;

/*
Lucky number: sum of square of every even position digit and it is a multiple of 9.
example: 1623 = even position digits are 6 and 3
square of them 36 abd 9
sum of square = 45
is sum of square is divisible by 9? yes. It is a lucky number.
 */
public class LuckyNumber {
    public static void main(String[] args) {

        //Let's think logic here.
        //Get single digit: 1,6,2,3
        //get only even index number 6 and 3
        //square and add them

        int number = 162;
        int sum = 0;

        LinkedList<Integer> store = new LinkedList<>();

        while (number != 0 ){
            store.push(number % 10);
            number = number/10;
        }

        System.out.println("Numbers are " + store);

        for (int i = 0; i<store.size();i++){
            if(i%2 != 0){
                int evenNumber = store.get(i);
                System.out.println("Numbers in even index is/are "+ evenNumber);
                int square =  evenNumber*evenNumber;
                sum = sum + square;
            }
        }
        System.out.println("Sum of square of even number is " + sum);
        if(sum % 9 == 0){
            System.out.println(sum + " : is a lucky number");
        }else {
            System.out.println(sum + " : is not a lucky number");
        }
    }

}
