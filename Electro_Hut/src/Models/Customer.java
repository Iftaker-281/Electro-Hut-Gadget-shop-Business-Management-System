package Models;

public class Customer extends User {

    private int customerId;
    private String address;

    public Customer(int customerId, String name, String phone, String address) {
        super(name, phone);
        this.customerId = customerId;
        this.address = address;
    }

    public int getCustomerId() { return customerId;}
    public String getName() { return super.name;}
    public String getPhone() {return super.phone; }
    public String getAddress() {return address;}

    public String toFileString() {
        return customerId + "," + name + "," + phone + "," + address;
    }
}