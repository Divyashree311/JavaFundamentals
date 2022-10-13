package casting;

public class DiscountTest {
    public static void main(String[] args) {
        Discount discount = new Discount();
        discount.setBillId(1001);
        discount.setCustomerId(101);
        discount.setBillAmount(199.99);
        discount.setDiscount(2);
        double result =  discount.calculateDiscount(discount.getBillAmount(), discount.getDiscount());
        System.out.println(discount.calculateDiscount(119.99,2));
        System.out.println("--------------------------Bill details ---------------------------");
        System.out.println("Customer id: " + discount.getCustomerId());
        System.out.println("Bill id " + discount.getBillId());
        System.out.println("Discounted bill amount is : " + result);

    }
}
