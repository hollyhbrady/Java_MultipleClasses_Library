import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Song of Achilles", "Madeleine Miller", "Queer");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Song of Achilles", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Madeleine Miller", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Queer", book.getGenre());
    }

}