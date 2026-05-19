package Models;

public class User {

    protected String name;
    protected String phone;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showUser() {
        System.out.println(name + " | " + phone);
    }
}