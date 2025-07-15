package practice2.logic;

public class LongestPrefix {
    public static void main(String[] args) {

        String[] input = {"flower","flew","flirt"};

        //Pick two longest string and compare

        int min = Math.min(input[0].length(),input[2].length());
        String prefix ="";
        for(int i=0; i<min;i++){

            if(input[0].charAt(i) == input[2].charAt(i)){
                prefix = prefix + input[0].charAt(i);
            }

        }

        System.out.println(prefix);

    }
}
