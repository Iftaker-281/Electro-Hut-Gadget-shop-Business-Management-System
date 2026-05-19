package Models;

public class Order {

    private String orderId;
    private String customerId;
    private String productId;
    private String resellerId;
    private int quantity;
    private double totalPrice;
    private String orderType;
    private String orderDate;

    public Order(String orderId, String customerId, String productId, String resellerId,
                 int quantity, double totalPrice, String orderType, String orderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.resellerId = resellerId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.orderType = orderType;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String toFileString() {
        return orderId + "," + customerId + "," + productId + "," + resellerId + "," +
                quantity + "," + totalPrice + "," + orderType + "," + orderDate;
    }
}