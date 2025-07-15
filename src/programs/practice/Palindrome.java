package programs.practice;

public class Palindrome {
    public static void main(String[] args) {

        //logic 1
        String word = "NAYAN";

        String reverse = new StringBuffer(word).reverse().toString();

        if(reverse.equals(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

        //logic 2
        if(checkPalindrome(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindorome");
        }

    }

    public static boolean checkPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            } else {
                left++;
                right--;

            }
        }
        return true;

    }

}
