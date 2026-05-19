package Models;
public class Admin extends User {

    private int adminId;
    private String email;
    private String password;

    public Admin(int adminId, String name, String phone, String email, String password) {
        super(name, phone);
        this.adminId = adminId;
        this.email = email;
        this.password = password;
    }

    public int getAdminId() {return adminId;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
    public String getName() {return super.name; }
    public String getPhone() { return super.phone;}

    public String toFileString() {
        return adminId + "," + name + "," + phone + "," + email + "," + password;
    }
}