public class Book {

    private String Title;
    private String ISBN;
    private String Author;
    private String DateOfPublish;

    public Book(String title, String ISBN, String author, String dateOfPublish) {
        this.Title = title;
        this.ISBN = ISBN;
        this.Author = author;
        this.DateOfPublish = dateOfPublish;
    }

    public String getTitle() {
        return Title;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book" + "Title='" + Title + '\'' + ", ISBN='" + ISBN + '\'' + ", Author='" + Author + '\'' + ", DateOfPublish='" + DateOfPublish + '\'' ;
    }
}
