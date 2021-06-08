import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReaderTest {

    Reader reader;
    Library library;
    Book book;

    @Before
    public void before() {
        reader = new Reader("Holly");
        library = new Library(3);
        library.addBook(book);
    }
    
    @Test
    public void readerHasName() {
        assertEquals("Holly", reader.getName());
    }

    @Test
    public void readerListStartsEmpty() {
        assertEquals(0, reader.bookCount());
    }

    @Test
    public void readerTakesBookFromLibrary() {
        reader.addBookFromLibrary(library);
        assertEquals(1, reader.bookCount());
        assertEquals(0, library.bookCount());
    }
}
