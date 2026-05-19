package Services;
import Models.Product;
import Filehandler.filehandeler;


public class ProductServices {

    public void addProduct(Product p) {
        filehandeler.write("products.txt", p.toFileString());
        System.out.println("Product added successfully!");
    }

    public void viewProducts() {
        String data = filehandeler.read("products.txt");
        System.out.println(data);
    }
}