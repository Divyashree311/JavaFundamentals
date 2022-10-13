package casting;

public class Discount {
    private int billId;
    private int customerId;
    private int discount;
    private double billAmount;

    public double calculateDiscount(double billAmount, int discount){
        this.billAmount = billAmount;
        this.discount = discount;
        return billAmount - billAmount*((double)discount/100);
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
}
