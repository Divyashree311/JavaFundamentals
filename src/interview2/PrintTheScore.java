package interview2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintTheScore {

    public static void main(String[] args) {

        //problem statement: Write a prg to create a quiz where we ask the user to guess as many African countries as possible.
        // The player will score one point per correct country and can end the quiz if enters ‘exit’. Print the score at the end while exiting.

        System.out.println("Enter the country: ");

      //  step1:

        List<String> country = Arrays.asList("Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo Verde", "Cameroon", "Central African Republic", "Chad", "Comoros", "Ivory Coast", "Djibouti", "Democratic Republic of the Congo", "Egypt", "Equatorial Guinea", "Eritrea", "Eswatini", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia");

       // step 2:
        Scanner scan = new Scanner(System.in);

     //   String input = scan.nextLine(); //

        int score = 0;


        while (true){

        String   input = scan.nextLine();
            if(country.contains(input)){
                System.out.println("Country " + input);
                score++;
            }

            if(input.equals("exit")){
                System.out.println(score);
                return;
            }

        }


//dev,





    }
}
