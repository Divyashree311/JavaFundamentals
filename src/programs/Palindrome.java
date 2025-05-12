package programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //NAYAN
        //  convert to lower case and have left and right pointer to check from front and backwards
        // left = 0 and right as length-1
        //left ++ and right--

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to test palindromeD");
        String word = scanner.next();


        if(isPalidrome(word)){
            System.out.println("Word: " + word + " is palindrome" );
        }else {
            System.out.println("Word: " + word + " is not a palindrome" );

        }


    }

    public static boolean isPalidrome(String str) {

        //"NAYAN"
       str =  str.toLowerCase();

       int left = 0;
       int right = str.length()-1;

       while (left < right){
           if(str.charAt(left) != str.charAt(right)){
               return false;
           }
           left++;
           right--;
       }

       return true;


    }
}
