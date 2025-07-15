package allprograms;

public class ExampleOfVarArgs {
    public static void main(String[] args) {

        System.out.println(ExampleOfVarArgs.add(1, 2,7));

    }

    public static int add(int... numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        return sum;
    }
}