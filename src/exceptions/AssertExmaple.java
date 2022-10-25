package exceptions;

public class AssertExmaple {
    public static void main(String[] args) {
        int age = 0;
        assert age > 18 : checkAge();
        System.out.println("Age valid");
    }

    private static String checkAge() {
        System.out.println("------");
        return "Age not valid";
    }
}
