import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book removeBook() {
        Book bookRemoved = null;
        if (this.bookCount() > 0){
            bookRemoved = this.books.remove(0);
        }
        return bookRemoved;
    }
}
