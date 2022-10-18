package polymorphyism.overloading;

public class MethodOverloadingExample {
    int a,b;
    double add(double a, int b){
        return a+b;
    }
    int add(int b, int a){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
       int result= methodOverloadingExample.add(6,8);
        System.out.println(result);
    }
}
