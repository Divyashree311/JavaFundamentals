public class Main {
    public static void main(String[] args) {
        String paymentId = "S4112";
        char[] numbers = paymentId.toCharArray();
        if (paymentId.startsWith("S") && paymentId.length()==5 ) {
            for (int i = 1; i < numbers.length; i++) {
                if (Character.isDigit(numbers[i])) {
                    System.out.println("Card validated");
                } else {
                    System.out.println("Not a proper card format");
                    break;
                }
            }

        }else {
            System.out.println("Not a proper card");
        }
    }
}