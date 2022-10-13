package keywordsandidentifiers;

public class Rectangle {
    private int length;
    private int breadth;

    public int calculatePerimeter(int l, int b){
        length = l;
        breadth = b;
        return 2*(length*breadth);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
