package abstractexample;

public class ShoppingPayment extends PaymentServices {
    static int counter = 1000;
    String paymentId;

    @Override
    public void payBill(double amount) {
        if (amount < balance) {
            System.out.println("Congratulations!! You have successfully made a payment of " + amount + ". Payment details are : ");
            System.out.println("Customer ID " + customerId);
            System.out.println("Payment ID  " + getPaymentId());
            System.out.println("Previous Due " + balance);
            System.out.println("Remaining Due " + (balance - amount));
        } else if (amount == balance) {
            paymentId = 'S' + String.valueOf(counter);
            System.out.println("Congratulations!! You have successfully made a payment of " + amount + ". Payment id is : " +
                    paymentId);
        } else {
            System.out.println("Excess amount entered!! try again");
        }
    }

    ShoppingPayment(double balance, int customerId) {
        super(balance, customerId);
        counter++;
    }

    public String getPaymentId() {
        paymentId = "C" + counter;
        return paymentId;
    }

}
