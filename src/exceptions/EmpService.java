package exceptions;

public class EmpService {

    public void checkEmpSalary(Employee employee) throws EmpSalaryException {
        if(employee.getEmpSalary()<1000){
            System.out.println("Emp salary "+ employee.getEmpSalary() + "\nAge : " + employee.getAge() + "\nEmp name: " + employee.getEmpName());
            throw new EmpSalaryException("Salary is lesser than 1000");
        }
    }

    public static void main(String[] args)  {
        EmpService empService = new EmpService();
        Employee employee = new Employee("Divya",24,53546757);
        Employee employee2 = new Employee("Kavya",24,535467579);
        Employee employee3 = new Employee("Momo",24,900);

        Employee[] employees = {employee,employee2,employee3};
        for(Employee employee1: employees){
            try {
                empService.checkEmpSalary(employee1);
            } catch (EmpSalaryException e) {
                System.out.println(e.getMessage() + " " + employee1.getEmpName());
            }
        }


    }
}
