package practice2.logic;

import java.util.HashSet;
import java.util.Set;

public class VowelsAndConsonents {
    public static void main(String[] args) {

        String name = "Divyashree".toLowerCase();

        String vowel ="aeiou";
        int countVowels =0;
        int countConsonents=0;

        for (int i=0;i<name.length();i++)    {

            if(vowel.indexOf(name.charAt(i)) != -1){
                countVowels++;
            }else{
                countConsonents++;
            }

        }

        System.out.println("Vowels " + countVowels + " con " + countConsonents);

    }
}
