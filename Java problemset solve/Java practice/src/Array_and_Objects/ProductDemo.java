package Array_and_Objects;

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
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        products[0] = new Product(101, "Laptop", 75000);
        products[1] = new Product(102, "Mouse", 800);
        products[2] = new Product(103, "Keyboard", 1500);
        products[3] = new Product(104, "Monitor", 18000);
        products[4] = new Product(105, "Printer", 22000);

        for (int i = 0; i < products.length; i++) {
            products[i].displayProduct();
        }
    }
}