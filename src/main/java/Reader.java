import java.util.ArrayList;

public class Reader {

    private ArrayList<Book> books;
    private String name;
    Book book;
    Library library;

    public Reader(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int bookCount() {
        return this.books.size();
    }

    private void takeBook(Book bookRemoved) {
        this.books.remove(bookRemoved);
    }

    public void addBookFromLibrary() {
        if (this.bookCount() < 1) {
            Book bookRemoved = library.removeBook();
            this.takeBook(bookRemoved);
        }
    }

}
