package operators;

public class Calculator {
    int a = 10;
    int b = 2;

    public int addition(){
        return a+b;
    }

    public int subtraction(){
        b +=a;
        return a-b;
    }
    public int multiplication(){
        return a*b;
    }
    public int division(){
        return a/b;
    }

}
