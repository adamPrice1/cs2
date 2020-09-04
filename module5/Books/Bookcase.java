public class Bookcase {

    private static int BOOKS_PER_SHELF = 10;
    private Book[][] shelves = new Book[5][BOOKS_PER_SHELF];

    public boolean addBook(Book toAdd) {
        for (int i = 0; i < shelves.length; i++) {
            for (int j = 0; j < shelves[i].length; j++) {
                if (shelves[i][j] == null) {
                    shelves[i][j] = toAdd;
                    return true;
                }
            }
        }
        return false;
    }

    public Book removeBook(Book toRemove) {
        for (int i = 0; i < shelves.length; i++) {
            for (int j = 0; j < shelves[i].length; j++) {
                if (shelves[i][j] != null) {
                    if (shelves[i][j].equals(toRemove)) {
                        return toRemove;
                    }
                }
            }
        }
        return null;
    }

}
