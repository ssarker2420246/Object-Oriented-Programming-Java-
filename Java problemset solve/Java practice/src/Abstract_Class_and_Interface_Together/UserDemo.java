package Abstract_Class_and_Interface_Together;

abstract class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    abstract void displayRole();
}

interface Loginable {
    void login();
}

class Admin extends User implements Loginable {
    Admin(String name, String email) {
        super(name, email);
    }

    public void login() {
        System.out.println(name + " logged in as Admin.");
    }

    void displayRole() {
        System.out.println("Role: Admin");
    }
}

class Customer extends User implements Loginable {
    Customer(String name, String email) {
        super(name, email);
    }

    public void login() {
        System.out.println(name + " logged in as Customer.");
    }

    void displayRole() {
        System.out.println("Role: Customer");
    }
}

public class UserDemo {
    public static void main(String[] args) {
        Admin admin = new Admin("Mr. Hasan", "admin@example.com");
        Customer customer = new Customer("Rahim", "rahim@example.com");

        admin.login();
        admin.displayRole();

        customer.login();
        customer.displayRole();
    }
}