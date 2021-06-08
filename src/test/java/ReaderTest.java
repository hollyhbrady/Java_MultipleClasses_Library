import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReaderTest {

    Reader reader;

    @Before
    public void before() {
        reader = new Reader("Holly");
    }
    
    @Test
    public void readerHasName() {
        assertEquals("Holly", reader.getName());
    }
}
