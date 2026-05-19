package Models;

public class CashPayment extends Payment {

    public CashPayment(String paymentId, String orderId, double amount) {
        super(paymentId, orderId, amount);
    }

    public void processPayment() {
        System.out.println("Cash Payment Successful for Order: " + orderId);
    }
}
