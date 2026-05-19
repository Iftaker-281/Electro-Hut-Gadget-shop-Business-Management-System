package Services;

import Models.Order;
import Filehandler.filehandeler;

public class OrderService {

    public void addOrder(Order o) {
    	filehandeler.write("orders.txt", o.toFileString());
        System.out.println("Order placed successfully");
    }

    public void viewOrders() {
    	filehandeler.read("orders.txt");
    }
}