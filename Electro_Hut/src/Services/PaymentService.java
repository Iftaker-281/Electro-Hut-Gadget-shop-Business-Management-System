package Services;

import Models.Payment;
import Models.CashPayment;
import Models.CardPayment;
import Filehandler.filehandeler;

public class PaymentService {

    public void addPayment(String paymentId, String orderId, double amount, String method) {

        Payment payment;

        if (method.equalsIgnoreCase("cash")) {
            payment = new CashPayment(paymentId, orderId, amount);
        } 
        else {
            payment = new CardPayment(paymentId, orderId, amount);
        }

       payment.processPayment();

        filehandeler.write("payments.txt", payment.toFileString());

        System.out.println("Payment saved successfully!");
    }

    public void viewPayments() {
        String data = filehandeler.read("payments.txt");
        System.out.println(data);
    }
}