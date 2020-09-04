import java.math.BigInteger;

public class TestClass {
    public static void main(String[] args) {
        // Book selection
        Book mobyDick = new Book("Moby Dick", "Herman Melville", new BigInteger("1234567891012"));
        Book tlap = new Book("Think like a Programmer", "V. Anton Spraul", new BigInteger("12336567891012"));

        // Bookcase selection
        Bookcase bookCase1 = new Bookcase();
        Bookcase bookCase2 = new Bookcase();

        // Reader selection
        Reader adam = new Reader("Adam Price", null);
        Reader alan = new Reader("Alan Brennan", null);

        // see what books everyone is reading
        System.out.println(adam.currentBookDescription());
        System.out.println(alan.currentBookDescription());

        // add books to bookcase
        bookCase1.addBook(mobyDick);
        bookCase1.addBook(tlap);

        // grab the book from the bookcase
        adam.getBookFromBookcase(mobyDick, bookCase1);
        System.out.println(adam.currentBookDescription());
        adam.getBookFromBookcase(tlap, bookCase1);
        System.out.println(adam.currentBookDescription());

        // put a book back in
        adam.storeBook(bookCase2);
        System.out.println(adam.currentBookDescription());

        // get a book out again
        alan.getBookFromBookcase(tlap, bookCase1);
        System.out.println(alan.currentBookDescription());
    }
}
