package programs;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        int reverseNumber=0;
        int reminder;

        //output 4321 so, first you need to get 4, then 3, 2 and 1.We can use modulus to get reminder by dividing number by 10.
        //let's store that number in reminder and add other reverse number * 10
        // divide number/10 get quotient and continue on dividing

        //1234 != 0 --> proceed
        // reminder = 1234 % 10 ---> 4
        // reverseNumber = 4 + 10 * 0 --> 4
        //number = 1234/10 -> 123

        //123 !=0  --> proceed
        //reminder = 123 % 10 ---> 3
        //reverseNumber = 3 + 10 * 4 = 43
        //number = 123/10 = 12

        //goes on

        System.out.println("---using while loop---");
        while (number != 0 ){
            reminder= number % 10;
            reverseNumber = reminder + 10 * reverseNumber;
            number = number/10;
        }
        System.out.println(reverseNumber);


        System.out.println("---using for loop---");
        for (int num = number ; num != 0 ; num= number/10){
            reminder= num % 10;
            reverseNumber = reminder + 10 * reverseNumber;
            System.out.println("reverse number " + reverseNumber);
        }
        System.out.println(reverseNumber);


        int number2= 1234;
        int reverseNumber2=0;

        System.out.println("---using do while loop---");
        do{
            int reminder2= number2 % 10;
            reverseNumber2 = reminder2 + 10 * reverseNumber2;
            number2 = number2/10;
        }while (number2 != 0);
        System.out.println(reverseNumber2);

    }
}
