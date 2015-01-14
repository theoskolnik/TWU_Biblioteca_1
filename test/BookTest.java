import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class BookTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldReturnDetailsOfSingleBook() {
        Book book = new Book("Harry Potter: The Sorcerer's Stone", "J.K.", 2000);
        assertEquals("Harry Potter: The So | J.K.       | 2000", book.returnBookDetails());
    }

}