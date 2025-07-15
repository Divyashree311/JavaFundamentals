package allprograms.casting;

public class DowncastingExample {

    public static void main(String[] args) {

        //downcasting -> converting super class to sub class

        Animals animals = new Dogs(); //upcasting

        Dogs dogs = (Dogs) animals; //down

        dogs.bark();
        dogs.animalMethod();
        dogs.dogMethod();




    }

}


class Animals{

    void bark(){
        System.out.println("Animal barks");
    }

    void  animalMethod(){
        System.out.println("Animal method");
    }

}

class Dogs extends  Animals{

    void bark(){
        System.out.println("Dog Barks");
    }

    void dogMethod(){
        System.out.println("Dog method");
    }

}