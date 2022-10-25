package programs;

public class ReverseNumberUsingString {
    public static void main(String[] args) {
        int number = 65478;
        String converToString = String.valueOf(number);
        StringBuffer stringBuffer = new StringBuffer(converToString);
        System.out.println(stringBuffer.reverse());
    }
}
