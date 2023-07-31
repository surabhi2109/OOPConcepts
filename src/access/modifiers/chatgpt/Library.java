package access.modifiers.chatgpt;

//Create a class `Library` that stores information about books in a library. The class should have private data members `bookTitle`, `author`, and `isbn`. Provide public methods to get and set these details. Also, implement a method to check if two books are the same based on their `isbn` numbers.

public class Library {
    private String bookTitle;
    private String author;
    private long isbn;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public boolean areBooksSame(Library l){
        if(this.isbn == l.isbn){
            return true;
        }
        return false;
    }
}
