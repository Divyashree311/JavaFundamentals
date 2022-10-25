package exceptions;

public class FindCube {
    public static int findCube(int n){
        int cube = n * n* n;
        return cube;

    }

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);
            System.out.println (findCube(number));

        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException.getStackTrace());
        }

    }
}
