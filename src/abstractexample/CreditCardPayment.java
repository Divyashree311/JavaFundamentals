package abstractexample;

public class CreditCardPayment extends PaymentServices {

    static int counter = 1000;
    String paymentId;
    double cashBack;
    double balanaceDue;


    CreditCardPayment(double balance, int customerId) {
        super(balance, customerId);
        counter++;
    }


    @Override
    public void payBill(double amount) {
        if (amount > balance) {
            cashBack = amount - balance;
            System.out.println("Congratulations!! You have successfully made a payment of " + amount + ". Payment details are : ");
            System.out.println("Customer ID " + customerId);
            System.out.println("Payment ID  " + getPaymentId());
            System.out.println("Previous Due " + balance);
            System.out.println("Remaining Due " + getBalanaceDue());
            System.out.println("Cashback  " + getCashBack());

        } else if (amount < balance) {
            balanaceDue = balance - amount;
            System.out.println("Congratulations!! You have successfully made a payment of " + amount + ". Payment details are : ");
            System.out.println("Customer ID " + customerId);
            System.out.println("Payment ID  " + getPaymentId());
            System.out.println("Previous Due " + balance);
            System.out.println("Remaining Due " + getBalanaceDue());
            System.out.println("Cashback  " + getCashBack());
        }
    }

    public String getPaymentId() {
        paymentId = "C" + counter;
        return paymentId;
    }

    public double getCashBack() {
        return cashBack;
    }

    public double getBalanaceDue() {
        return balanaceDue;
    }

}
