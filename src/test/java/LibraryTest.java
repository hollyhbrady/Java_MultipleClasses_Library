import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(3);
        book = new Book("Song of Achilles", "Madeleine Miller", "Queer");
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void libraryHasBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

}
