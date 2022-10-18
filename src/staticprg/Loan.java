package staticprg;

public class Loan {
    private int loanNO;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float intrest;

    private static int loanCounter;

    static {
        loanCounter =101;
    }

    public static int getLoanCounter() {
        return loanCounter;
    }



    Loan(){
        loanCounter++;
        loanNO = loanCounter;
    }

    public Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float intrest) {
        loanCounter++;
        loanNO = loanCounter;
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.intrest = intrest;
    }

    public int getLoanNO() {
        return loanNO;
    }

    public void setLoanNO(int loanNO) {
        this.loanNO = loanNO;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public float getIntrest() {
        return intrest;
    }

    public void setIntrest(float intrest) {
        this.intrest = intrest;
    }
}
