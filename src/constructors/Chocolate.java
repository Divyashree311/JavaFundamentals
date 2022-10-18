package constructors;

public class Chocolate {
    private long barCode;
    private String name;
    private double weight;
    private int cost;

     Chocolate(){
        barCode = 101189378963l;
        name = "Cadbury";
        weight = 12.0;
        cost = 10;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
