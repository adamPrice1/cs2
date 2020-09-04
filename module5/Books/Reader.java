public class Reader {
    private String name;
    private Book currentlyReading;

    public Reader(String newName, Book newCurrentlyReading) {
        this.name = newName;
        this.currentlyReading = newCurrentlyReading;
    }

    public void getBookFromBookcase(Book bookToGet, Bookcase bookcaseToGetFrom) {
        this.currentlyReading = bookcaseToGetFrom.removeBook(bookToGet);
    }

    public void storeBook(Bookcase bookcaseToGetFrom) {
        bookcaseToGetFrom.addBook(this.currentlyReading);
        this.currentlyReading = null;
    }

    public String currentBookDescription() {
        if (this.currentlyReading != null) {
            return this.name + " is reading " + this.currentlyReading.toString();
        }
        return this.name + " is not reading anything.";
    }
}
