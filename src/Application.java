import java.io.PrintStream;

/**
 * Created by ialsanea on 1/13/15.
 */
public class Application {
    private Library library;
    private PrintStream printStream;

    public Application(Library library, PrintStream printStream) {
        this.printStream = printStream;
        this.library = library;
    }

    public void start() {
        printStream.println("Welcome");
    }


    public void printLibraryBooks() {

    }
}
