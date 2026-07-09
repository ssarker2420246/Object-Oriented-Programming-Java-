package Library_Management_Mini_Problem;

import java.util.ArrayList;

class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void displayBook() {
        System.out.println(bookId + " - " + title + " by " + author);
    }
}

class Member {
    int memberId;
    String name;

    Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println(book.title + " added to library.");
    }

    void borrowBook(int bookId, Member member) {
        for (Book book : books) {
            if (book.bookId == bookId && book.isAvailable) {
                book.isAvailable = false;
                System.out.println(member.name + " borrowed " + book.title);
                return;
            }
        }

        System.out.println("Book not available.");
    }

    void returnBook(int bookId, Member member) {
        for (Book book : books) {
            if (book.bookId == bookId && !book.isAvailable) {
                book.isAvailable = true;
                System.out.println(member.name + " returned " + book.title);
                return;
            }
        }

        System.out.println("Invalid return request.");
    }

    void displayAvailableBooks() {
        System.out.println("Available Books:");

        for (Book book : books) {
            if (book.isAvailable) {
                book.displayBook();
            }
        }
    }
}

public class LibraryManagementDemo {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "OOP Concepts", "Robert Martin");

        Member member = new Member(1, "Nila");

        library.addBook(b1);
        library.addBook(b2);

        library.displayAvailableBooks();

        library.borrowBook(101, member);

        library.displayAvailableBooks();

        library.returnBook(101, member);

        library.displayAvailableBooks();
    }
}