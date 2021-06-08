import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;

    @Before
    public void before() {
        library = new Library(3);
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

}
