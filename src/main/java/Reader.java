import java.util.ArrayList;

public class Reader {

    private ArrayList<Book> books;
    private String name;

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
}
