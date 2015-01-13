import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


 // As a customer, after the welcome message appears I would like
 // to see a list of all library books, so that I can browse for
 // books I might want to check-out. Assume that there is a
 // pre-existing list of books. You don't need to support adding
 // or removing books from the library.

public class LibraryTest {

    @Test
    public void shouldPrintWelcomeMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(printStream);

        library.printGreeting();

        verify(printStream).println("Welcome");
    }

    @Test
    public void shouldListAllLibraryBooks() {

    }
}