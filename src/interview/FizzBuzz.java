package interview;

import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =20;

        Map<Integer,String> map = new HashMap<>();
        map.put(3,"Fizz");
        map.put(5,"Buzz");

        for (int i = 1; i<=num;i++){

           StringBuilder sb = new StringBuilder();
            for (Map.Entry<Integer,String> map1: map.entrySet()){
                if(i%map1.getKey()==0){
                    sb.append(map1.getValue());
                }
            }

            if(sb.length()>1){
                System.out.println(sb);
            }else{
                System.out.println(i);
            }

        }


    }
}
