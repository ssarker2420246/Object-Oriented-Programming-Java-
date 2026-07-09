public class MyLibrary {

    private Book[] collection = new Book[200];
    public static int Count =0;

    public static void main(String[] args) {

        MyLibrary L = new MyLibrary();

        try{
            L.AddBook(new Book("To Kill a Mockingbird", "8123", "Harper Lee", "05-11-1960"));
            L.AddBook(new Book("The Great Gatsby", "1212", "F. Scott Fitzgerald", "26-04-1925"));
            L.AddBook(new Book("One Hundred Years of Solitude", "9280", "Gabriel Márquez", "13-11-1967"));
            L.AddBook(new Book("The Great Gatsby", "1212", "F. Scott Fitzgerald", "26-04-1925" ));
        }

        catch (Exception e){
            System.out.println("ERROR! -> " + e);
        }
        System.out.println();

        try {
            System.out.println("Search for the Books: ");
            System.out.println(L.searchFORBook("One Hundred Years of Solitude"));
            System.out.println(L.searchFORBook("Brave New World"));
        }catch (Exception e){
            System.out.println("ERROR! -> " + e);
        }
    }

    public void AddBook(Book BK) throws DuplicateItemException {

        for (int i = 0; i < Count; i++ ){
            if (collection[i].getTitle().equalsIgnoreCase(BK.getTitle()) && (collection[i].getISBN().equals(BK.getISBN()))){
                throw new DuplicateItemException("“This book (" + collection[i].getTitle() +") is already included in the collection.");
            }
        }

        collection[Count++] = BK;
    }

    public Book searchFORBook(String title) throws ItemNotFoundException{
        for (int i = 0; i < Count; i++){
            if (collection[i].getTitle().equalsIgnoreCase(title)){
                return collection[i];
            }
        }
        throw new ItemNotFoundException(title + " is being searched does not exist in the collection");
    }
}




class DuplicateItemException extends Exception{

    DuplicateItemException(String text)
    {
        super(text);
    }
}

class ItemNotFoundException extends Exception{

    ItemNotFoundException(String text)
    {
        super(text);
    }
}