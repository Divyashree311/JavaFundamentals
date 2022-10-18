package polymorphyism.overloading;

public class Example2 {
    void display(String ref){
        System.out.println("String " + ref);
    }

    void display(Object ref){
        System.out.println("Object" + ref);
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        example2.display(null);
    }
}
