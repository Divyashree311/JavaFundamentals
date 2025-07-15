package practice2.logic;

public class Palindrome {
    public static void main(String[] args) {

        String input = "Nayan".toLowerCase();

        int count = 0;
        int mid = input.length()/2;
        for (int i = 0; i<mid;i++){
            int val = i+1;
                if(!(input.charAt(i) == input.charAt(input.length()-val))){
                   return ;
                }else{
                 count++;
                }
        }

        if(count==mid){
            System.out.println("Print a palindrome");
        }


    }
}
