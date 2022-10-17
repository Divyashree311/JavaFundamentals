package constructors;

public class ChocolateTester {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();

        System.out.println("Barcode " + chocolate.getBarCode());
        System.out.println("Name " + chocolate.getName());
        System.out.println("Weight " + chocolate.getWeight());
        System.out.println("Cost " + chocolate.getCost());

        chocolate.setBarCode(102);
        chocolate.setName("Hershey's");
        chocolate.setCost(20);
        chocolate.setWeight(15.0);

        System.out.println("Barcode " + chocolate.getBarCode());
        System.out.println("Name " + chocolate.getName());
        System.out.println("Weight " + chocolate.getWeight());
        System.out.println("Cost " + chocolate.getCost());

    }
}
