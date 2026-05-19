import java.util.Scanner;


import Models.Product;
import Models.Order;
import Models.Reseller;

import Services.ProductServices;
import Services.OrderService;
import Services.PaymentService;
import Services.ResellerServices;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductServices P = new ProductServices();
        OrderService Orders = new OrderService();
        PaymentService Pay = new PaymentService();
        ResellerServices resellerService = new ResellerServices();

        System.out.println("~~~~~~ WELCOME TO ELECTRO HUT ~~~~~~");
        System.out.println("Press Enter To Continue...");
        sc.nextLine();

        while (true) {

            System.out.println("\n~~~~~~~ ELECTRO HUT MENU ~~~~~~~");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Add Order");
            System.out.println("4. Add Payment");
            System.out.println("5. View Orders");
            System.out.println("6. View Resellers");
            System.out.println("7. Add Reseller");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Product ID: ");
                String id = sc.next();
                sc.nextLine();


                System.out.print("Product Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Stock: ");
                int stock = sc.nextInt();

                sc.nextLine();

                System.out.print("Category: ");
                String category = sc.nextLine();

                Product product = new Product(id, name, price, stock, category);
                P.addProduct(product);
            }

            else if (choice == 2) {
                P.viewProducts();
            }
            else if (choice == 3) {

            	System.out.print("Order ID: ");
            	String orderId = sc.next();

            	System.out.print("Customer ID: ");
            	String customerId = sc.next();

            	System.out.print("Product ID: ");
            	String productId = sc.next();

            	System.out.print("Reseller ID: ");
            	String resellerId = sc.next();

            	System.out.print("Quantity: ");
            	int quantity = sc.nextInt();

            	System.out.print("Total Price: ");
            	double totalPrice = sc.nextDouble();

            	sc.nextLine(); 
            	
            	System.out.print("Order Type: ");
            	String orderType = sc.nextLine();

            	System.out.print("Order Date: ");
            	String orderDate = sc.nextLine();
                
            	Order order = new Order(orderId,customerId,productId,resellerId,quantity,totalPrice,orderType,orderDate);
                Orders.addOrder(order);
            }

            	else if (choice == 4) {

            	    System.out.print("Payment ID: ");
            	    String paymentId = sc.next();

            	    System.out.print("Order ID: ");
            	    String orderId = sc.next();

            	    System.out.print("Amount: ");
            	    double amount = sc.nextDouble();

            	    System.out.print("Payment Method (cash/card): ");
            	    String method = sc.next();

            	    Pay.addPayment(paymentId, orderId, amount, method);
            	
              
            }

            else if (choice == 5) {
                System.out.println("===== ALL ORDERS =====");
                Orders.viewOrders();
            }
            
            else if (choice == 6) {
                System.out.println("===== ALL RESELLERS =====");
                resellerService.viewResellers();
            }

            else if (choice == 7) {

            	System.out.print("Reseller ID: ");
            	String id = sc.next();

            	sc.nextLine();

            	System.out.print("Name: ");
            	String name = sc.nextLine();

            	System.out.print("Phone: ");
            	String phone = sc.nextLine();

            	System.out.print("Status: ");
            	String status = sc.nextLine();

            	Reseller r = new Reseller(id, name, phone, status);

            	resellerService.addReseller(r);
            }
            
            else if (choice == 8) {
                System.out.println("System Exit");
                break;
            }

            else {
                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}