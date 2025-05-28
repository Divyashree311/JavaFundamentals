package programs;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesUsingJavaLogic {
    public static void main(String[] args) {

        int[] arr = {11,22,11,3,44,55,22,3};
        int[] temp ;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<arr.length;i++){

            for (int j = i+1; j<arr.length ; j++){

                if(arr[i] == arr[j]){
                    list.add(arr[i]);
                }

            }

        }

        System.out.println("Duplicates elements are: " + list);

    }
}
