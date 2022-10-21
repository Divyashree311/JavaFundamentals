package programs;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
Lucky number: sum of square of every even position digit and it is a multiple of 9.
example: 1623 = even position digits are 6 and 3
square of them 36 abd 9
sum of square = 45
is sum of square is divisible by 9? yes. It is a lucky number.
 */
public class LuckyNumberMethod2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Integer number = scanner.nextInt();
            String getNumber = number.toString();
            int sum =0;

            for (int i = 0;i<getNumber.length();i++){
                int getSingleNumber = number%10;
                number = number/10;
                int check = getNumber.length();
                if(check % 2 == 0 ){
                    if ((i%2 == 0 )){
                        System.out.println("Index: " + i + " Number: " + getSingleNumber);
                       int square = getSingleNumber * getSingleNumber;
                        sum = square + sum;
                    }
                } else {
                    if(i%2 != 0){
                        System.out.println("Index: " + i + " Number: " + getSingleNumber);
                        int square = getSingleNumber * getSingleNumber;
                        sum = square + sum;
                    }
                }
            }

            if(sum%9 == 0){
                System.out.println(sum + " is a lucky number");
            }else {
                System.out.println(sum + " is not a lucky number");
            }

    }
}
