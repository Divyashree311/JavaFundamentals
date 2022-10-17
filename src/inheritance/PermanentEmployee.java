package inheritance;

public class PermanentEmployee extends Employee{
    private double basicSalary;
    private double hra;
    private double experience;
    private int variableComponent;


    double calculateSalary(){


        if(experience<0){
             this.variableComponent = 0;
        } else if(experience>=3 && experience<5){
             this.variableComponent=5;
        } else if (experience >=5 && experience <10) {
             this.variableComponent=7;
        }else {
             this.variableComponent=12;
        }

        double sal = basicSalary + hra + (variableComponent*basicSalary)/100;
        return sal;

    }


    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
