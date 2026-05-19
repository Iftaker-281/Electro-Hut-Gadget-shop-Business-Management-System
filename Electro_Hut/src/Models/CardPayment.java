package Models;

public class CardPayment extends Payment {

    public CardPayment(String paymentId, String orderId, double amount) {
        super(paymentId, orderId, amount);
    }

    public void processPayment() {
        System.out.println("Card Payment Successful for Order: " + orderId);
    }
}
