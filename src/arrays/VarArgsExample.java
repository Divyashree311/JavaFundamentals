package arrays;

public class VarArgsExample {
    public static void main(String... args) {
        VarArgsExample varArgsExample = new VarArgsExample();
        varArgsExample.displayList(1,5,6,7);
        varArgsExample.maxOfList(1,6,7);
        varArgsExample.sortList(7);
        varArgsExample.averageList(1,5,6,7,9,373);

    }
    void displayList(int... input){
        for (int i: input){
            System.out.println(i);
        }
    }

    void maxOfList(int... input){
        for (int i: input){
            System.out.println(i);
        }
    }
    void sortList(int... input){
        for (int i: input){
            System.out.println(i);
        }
    }

    void averageList(int... input){
        for (int i: input){
            System.out.println(i);
        }
    }

}
