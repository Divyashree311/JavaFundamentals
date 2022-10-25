package abstractexample;

public abstract class PaymentServices {
    double balance;
    int customerId;

    public abstract void payBill(double amount);

    public PaymentServices(double balance, int customerId) {
        this.balance = balance;
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }



}
