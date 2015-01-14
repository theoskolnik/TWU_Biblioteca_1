import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ialsanea on 1/14/15.
 */
public class BookTest {
    @Test
    public void shouldStringifyAllDetailsOfOneBook() {
        Book book = new Book("Title", "Author", 2015);
        assertThat(book.toString(), is("Title Author " + 2015));
    }

    @Test
    public void shouldSeparateBookDetailsIntoColumns() {
        Book book1 = new Book("Title", "Author", 2015);
        Book book2 = new Book("Long Title", "Long Author Name", 2015);
        assertThat(book1.toString(), is("Title                | Author     | 2015"));
        assertThat(book2.toString(), is("Long Title           | Long Autho | 2015"));
    }
}
