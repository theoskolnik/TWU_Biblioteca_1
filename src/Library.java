import java.io.PrintStream;

/**
 * Created by ialsanea on 1/13/15.
 */
public class Library {
    private PrintStream printStream;

    public Library(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printGreeting() {
        printStream.println("Welcome");
    }

    public void printAllLibraryBooks() {
    }
}
