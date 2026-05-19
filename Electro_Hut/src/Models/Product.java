package Models;
public class Product {
    public String productId;
    public String name;
    public double price;
    public int stock;
    public String category;

    public Product(String productId, String name, double price, int stock, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public String toFileString() {
        return productId + "," + name + "," + price + "," + stock + "," + category;
    }
}
