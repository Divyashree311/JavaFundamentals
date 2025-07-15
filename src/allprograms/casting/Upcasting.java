package allprograms.casting;

public class Upcasting {
    public static void main(String[] args) {
        //upcasting -> converting child(sub-class) to parent(super-class) class type

        Dog dog = new Dog();
        Animal animal = dog;

        animal.animalMethod();
        animal.bark();//casting -> dog barks
      //  animal.dogMethod(); -> super class cannot access sub class methods

    }
}

class Animal{

    void bark(){
        System.out.println("Animal barks");
    }

    void  animalMethod(){
        System.out.println("Animal method");
    }

}

class Dog extends  Animal{

    void bark(){
        System.out.println("Dog Barks");
    }

    void dogMethod(){
        System.out.println("Dog method");
    }

}