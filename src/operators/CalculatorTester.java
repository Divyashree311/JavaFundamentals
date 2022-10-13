package operators;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition : " + calculator.addition());
        System.out.println("Subtraction : " + calculator.subtraction());
        System.out.println("Multiplication : " + calculator.multiplication());
        System.out.println("Division: " + calculator.division());
    }
}
