package practice2.logic;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String[] input = {"tea","eat"};

        char[] word1 = input[0].toCharArray();
        char[] word2 = input[1].toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

                if(Arrays.equals(word1,word2)){

                    System.out.println("It is anagram");
                }else{
                    System.out.println("Not anagram");

                }

                //if word[i] != word[2] -> return false







    }
}
