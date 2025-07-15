package allprograms.oops;

public class TestMultipleInheritance implements ClassOne, ClassTwo{
    public void draw() {
        System.out.println("Hello");
    }

    //ClassOne.super.draw() can be used when the methods are default

    public static void main(String[] args) {
        TestMultipleInheritance testMultipleInheritance = new TestMultipleInheritance();
       testMultipleInheritance.draw();
    }
}
