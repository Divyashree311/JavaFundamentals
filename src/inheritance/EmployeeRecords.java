package inheritance;

public class EmployeeRecords {

    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        ContractEmployee contractEmployee = new ContractEmployee();

        permanentEmployee.setEmpId(101);
        permanentEmployee.setName("Divya");
        permanentEmployee.setBasicSalary(10000);
        permanentEmployee.setHra(1500);
        permanentEmployee.setExperience(3);

        System.out.println("Permanent Employee: your salary is: " + permanentEmployee.calculateSalary());

        contractEmployee.setEmpId(101);
        contractEmployee.setName("Divya");
        contractEmployee.setWages(500);
        contractEmployee.setHours(10);

        System.out.println("Contract Employee: your salary is: " + contractEmployee.calculateSalary());


    }
}
