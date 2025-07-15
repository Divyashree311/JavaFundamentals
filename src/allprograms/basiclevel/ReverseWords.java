package allprograms.basiclevel;

public class ReverseWords {
    public static void main(String[] args) {

        String[] input = "Java is fun".split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = input.length-1; i>=0;i--) {
            stringBuilder.append(input[i] + " ");

        }
        System.out.println(stringBuilder);


        //reverse using recurrsion

        String name = "Divya";
        //logic -> get last -> last - 1 + last -1

        System.out.println("Reverse: " + reverse(name));

    }


    public static String reverse(String input){


        if((input==null) || (input.length() <1)){
            return input;
        }
        return reverse(input.substring(1) + input.charAt(0));


    }
}
