package Models;

public class Payment {

    protected String paymentId;
    protected String orderId;
    protected double amount;

    public Payment(String paymentId, String orderId, double amount) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Payment processing");
    }

    public String toFileString() {
        return paymentId + "," + orderId + "," + amount;
    }
}