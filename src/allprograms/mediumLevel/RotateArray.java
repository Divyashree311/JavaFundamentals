package allprograms.mediumLevel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6};
        int rotate = 3;
        List<Integer> list = new LinkedList<>();
        for(int i =0; i<input.length;i++){
            if(i <=3){
                continue;
            }
            list.add(input[i]);
        }

        for(int i =0; i<input.length;i++){
            if(i >3){
                continue;
            }
            list.add(input[i]);
        }

        System.out.println(list);
    }
}
