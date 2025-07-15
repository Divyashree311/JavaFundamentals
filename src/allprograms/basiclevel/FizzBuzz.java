package allprograms.basiclevel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FizzBuzz {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(3,"Fizz");
        map.put(5,"Buzz");

        for (int i =1 ;i<=20;i++){

            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry<Integer,String> key: map.entrySet()){
                if(i%key.getKey()==0){
                    stringBuilder.append(key.getValue());
                }
            }

            if(stringBuilder.length()>1){
                System.out.println(stringBuilder);
            }else {
                System.out.println(i);
            }

        }



    }
}
