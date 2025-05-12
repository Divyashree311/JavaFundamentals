package practice2.java8;

import java.util.function.BiConsumer;

public class LambdaExpression {

    public static void main(String[] args) {
        System.out.println(addi(3,4));

        Addtional addtional = (h,n) ->  h+n;
        System.out.println(addtional.add(1,2));
        //lambda expression
      BiConsumer<Integer,Integer> additon= (d,e) -> System.out.println(d+e);
            additon.accept(2,9);
    }

    public static int addi(int a, int b){
        int sum = 0;
        sum = a+b;
        return sum;
    }



}
