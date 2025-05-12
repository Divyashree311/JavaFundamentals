package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1= scanner.next();
        System.out.println("Enter the second word");
        String word2 = scanner.next();

        word1 =  word1.toLowerCase();
        word2 = word2.toLowerCase();
        System.out.println(word1 + " " + word2);
        char[] charOfWord1 = word1.toCharArray();
        char[] charOfWord2 =word2.toCharArray();

        Arrays.sort(charOfWord1);
        Arrays.sort(charOfWord2);
        if(word1.length() == word2.length()) {
            if (Arrays.equals(charOfWord1, charOfWord2)) {
                System.out.println("Words are anagram word1: " + word1 + " word2: " + word2);
            } else {
                System.out.println("Not a anagram word1: \" + word1 + \" word2: \" + word2");
            }
        }else {
            System.out.println("Not a anagram word1: \" + word1 + \" word2: \" + word2");
        }


    }


}
