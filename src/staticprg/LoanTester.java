package staticprg;

public class LoanTester {
    public static void main(String[] args) {
        Loan loan = new Loan();
        System.out.println(Loan.getLoanCounter());

        Loan loan1 = new Loan(124,8786,9897.76f,2,3);



        System.out.println(Loan.getLoanCounter());
        System.out.println(loan1.getLoanAmount());
        System.out.println(loan1.getLoanDuration());
        System.out.println(loan1.getCustomerNo());
        System.out.println(loan1.getIntrest());
        System.out.println(loan1.getCustomerNo());
        System.out.println(loan1.getLoanNO());



    }
}
