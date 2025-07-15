package programs.practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "silent";
        String word2 ="listen";

        if(checkAnagram(word1,word2)==true){
            System.out.println("It's anagram");
        }else{
            System.out.println("Not a anagram");
        }
    }

    public static boolean checkAnagram(String word1, String word2){
          char[] arr1 =    word1.toLowerCase().toCharArray();
          char[] arr2 =    word2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return true;
        }

        return false;
    }
}
