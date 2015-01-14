import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ialsanea on 1/14/15.
 */
public class ApplicationTest {

    private Application app;
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        app = new Application(mock(Library.class), printStream);
    }


    @Test
    public void shouldPrintWelcomeMessageWhenAppStarts() {
        app.start();
        verify(printStream).println("Welcome");
    }
}
