package Online_Shopping_Mini_Problem;

import java.util.ArrayList;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println(productId + " - " + productName + " - " + price);
    }
}

class Customer {
    String name;
    String email;

    Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

class Cart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
        System.out.println(product.productName + " added to cart.");
    }

    void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.productName + " removed from cart.");
    }

    double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.price;
        }

        return total;
    }

    void displayCart() {
        System.out.println("Cart Items:");

        for (Product product : products) {
            product.displayProduct();
        }
    }
}

class Order {
    Customer customer;
    Cart cart;

    Order(Customer customer, Cart cart) {
        this.customer = customer;
        this.cart = cart;
    }

    void placeOrder() {
        System.out.println("Order placed by: " + customer.name);
        cart.displayCart();
        System.out.println("Total Amount: " + cart.calculateTotal());
    }
}

public class OnlineShoppingDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Rahim", "rahim@example.com");

        Product p1 = new Product(101, "Laptop", 75000);
        Product p2 = new Product(102, "Mouse", 800);
        Product p3 = new Product(103, "Keyboard", 1500);

        Cart cart = new Cart();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.removeProduct(p2);

        Order order = new Order(customer, cart);
        order.placeOrder();
    }
}