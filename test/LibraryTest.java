import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


// As a customer, after the welcome message appears I would like
 // to see a list of all library books, so that I can browse for
 // books I might want to check-out. Assume that there is a
 // pre-existing list of books. You don't need to support adding
 // or removing books from the library.

//As a customer, I'd like the list of all books to include each books
// Author and Year Published, so that I can be confident that I have
// found the book I am looking for. The book listing should have columns for this information.
public class LibraryTest {

    private Application app;
    private PrintStream printStream;
    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private ArrayList<Book> bookList;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        app = new Application(library, printStream);
        ArrayList<Book> bookList = new ArrayList<Book>();
        book = new Book("Title", "Author", 2015);
        Book book1 = new Book("Harry Potter", "JK Rowling", 2000);
        Book book2 = new Book("Twilight", "Stephanie Mayer", 2014);
        bookList.add(book1);
        bookList.add(book2);
        library = new Library(bookList);
    }

    @Test
    public void shouldPrintWelcomeMessageWhenAppStarts() {
        app.start();
        verify(printStream).println("Welcome");
    }

    @Test
    public void shouldListADetailsOfSingleBook() {
        assert(book1, )
    }


}