public class StringParser {
    public static void main(String[] args) {
        String input = "igbbg | 2 | 3 ; 657; hj; JT 567; 789; 556; JT 76; 87; JT 67; 89 |";

        // Split the input string by "|"
        String[] parts = input.split("\\|");
        System.out.println("Length: "+ parts.length);
        if (parts.length > 1) {
            // Split the second part by ";"
            String[] values = parts[2].trim().split(";");
            System.out.println("; length " + values.length);
            for (int i = 0; i < values.length; i++) {
                String value = values[i].trim();
                System.out.println("VALUE " + value);
                // Check if the value starts with "JT" and has a space after it
                if (value.startsWith("JT ") && value.length() > 3) {
                    String formattedOutput = parts[0].trim() + " " + value;
                    System.out.println("OUTPUT \n" + formattedOutput);
                }
            }
        }
    }
}
