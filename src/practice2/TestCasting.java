package practice2;

public class TestCasting {
    public static void main(String[] args) {
        //upcasting
        Child child = new Child();
        //using child we can access parent
        child.study();
        child.work();

        //upcasting
        Parent parent = child;
        parent.work();

        //Downcasting
        //step 1:do upcasting
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;

        child1.work();
        child1.study();









    }
}
