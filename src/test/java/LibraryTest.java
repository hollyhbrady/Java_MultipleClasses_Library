import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before() {
        library = new Library(3);
        book = new Book("Song of Achilles", "Madeleine Miller", "Queer");
        book2 = new Book("I, Robot", "Isaac Asimov", "Sci-fi");
        book3 = new Book("The Book Thief", "Markus Zusak", "Historic Fiction");
        book4 = new Book("Bedlam Stacks", "Natasha Pulley", "Sci-fi");
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
    public void canAddBookYes() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBookNo() {
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.bookCount());
    }

}
