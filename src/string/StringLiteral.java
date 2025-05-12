package string;

public class StringLiteral {
    public static void main(String[] args) {
        String name = "Divya";
         name = "Kavya is my friend";
        System.out.println(name);

        System.out.println(name.charAt(2));//0,1,2 - gives the character at 2nd index
        //string is thread safe mean state cannot be changed.
      //  System.out.println(name.split(" "));//loop with array
        System.out.println(name.indexOf('v'));//gives the index position
    }
}
