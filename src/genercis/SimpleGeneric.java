package genercis;


class Student {
    int sId;
    String name;

    public Student(int sId, String name) {
        this.sId = sId;
        this.name = name;
    }

}


class Record<E> {
    E record;

    public void display(E item) {
        System.out.println(item);
    }

}

public class SimpleGeneric {

    public static void main(String[] args) {
        Student student = new Student(101,"Div");
        Record<String> record = new Record<String>();
        record.display("Hey");
        record.display("Divya");
    }


}
