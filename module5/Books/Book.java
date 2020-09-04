import java.math.BigInteger;

public class Book {
    private String title;
    private String author;
    private BigInteger ISBN;

    public Book(String newTitle, String newAuthor, BigInteger newISBN) {
        title = newTitle;
        author = newAuthor;
        ISBN = newISBN;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN.toString();
    }

    public String toString() {
        return this.title + ", it's a book by " + this.author + ".";
    }

}
