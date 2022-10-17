package inheritance;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public int getEmpId(){
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
