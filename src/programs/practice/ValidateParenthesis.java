package programs.practice;

import java.util.Stack;

public class ValidateParenthesis {
    public static void main(String[] args) {
        String input = "[({})]";

        Stack<Character> characters = new Stack<>();

        for (char c: input.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                characters.push(c);
            }else
                if(characters.isEmpty()){
                    System.out.println("Not matching");
                }
        }

    }
}
