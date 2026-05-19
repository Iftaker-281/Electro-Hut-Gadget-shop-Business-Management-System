package Models;
public class Reseller extends User {

    private String resellerId;
    private String status;

    public Reseller(String resellerId, String name, String phone, String status) {
        super(name, phone);
        this.resellerId = resellerId;
        this.status = status;
    }
    public String getResellerId() { return resellerId; }
    public String getStatus() { return status;  }
    public String getName() {return super.name; }
    public String getPhone() { return super.phone;}
    
    public String toFileString() {
        return resellerId + "," + name + "," + phone + "," + status;
    }

}