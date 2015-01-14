import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


// As a customer, after the welcome message appears I would like
 // to see a list of all library books, so that I can browse for
 // books I might want to check-out. Assume that there is a
 // pre-existing list of books. You don't need to support adding
 // or removing books from the library.

//As a customer, I'd like the list of all books to include each books
// Author and Year Published, so that I can be confident that I have
// found the book I am looking for. The book listing should have columns for this information.
public class LibraryTest {
    private PrintStream printStream;
    private Library library;
    private Book book;
    private Book book2;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        List<Book> bookList = new ArrayList<Book>();
        book = mock(Book.class);
        book2 = mock(Book.class);
        bookList.add(book);
        bookList.add(book2);
        library = new Library(bookList);

    }

    @Test
    public void shouldPrintAllBooksFromLibrary() {
        when(book.toString()).thenReturn("Harry Potter JK Rowling 1999");
        when(book2.toString()).thenReturn("Twilight Jennifer Meyer 2004");
        library.printAllLibraryBooks(printStream);

        verify(printStream).println("Harry Potter JK Rowling 1999");
        verify(printStream).println("Twilight Jennifer Meyer 2004");
    }


}