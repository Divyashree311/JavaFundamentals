package abstractexample;

public class TestPayment {
    public static void main(String[] args) {
        PaymentServices paymentServices = new CreditCardPayment(10000.23,5001);
        paymentServices.payBill(15000.0);

        System.out.println("-------------------------------------------------------");
        PaymentServices paymentServices1 = new CreditCardPayment(10000.23,5001);
        paymentServices1.payBill(0.0);

        System.out.println("--------------------------------------------------------");
        PaymentServices paymentServices2 = new ShoppingPayment(10000.23,5001);
        paymentServices2.payBill(5000);

        System.out.println("--------------------------------------------------------");
        PaymentServices paymentServices3 = new ShoppingPayment(5000.0,561328);
        paymentServices3.payBill(5000);

        System.out.println("--------------------------------------------------------");
        PaymentServices paymentServices4 = new ShoppingPayment(5000.0,561328);
        paymentServices4.payBill(6000);
    }
}
