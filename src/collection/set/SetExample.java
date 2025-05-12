package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,9,0}));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(new Integer[]{11,4,7,8,9}));

        System.out.println("**UNION**");
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        System.out.println("**DUPLICATES");

        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);

        System.out.println(common);

        System.out.println("**DIFFERENCE**");

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(difference);



    }
}
