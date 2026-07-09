package Constructor;

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 500);
        Book b2 = new Book("OOP Concepts", "Robert Martin", 650);
        Book b3 = new Book("Data Structures", "Mark Allen", 700);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}