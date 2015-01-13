import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        ArrayList<Book> bookList = new ArrayList<Book>();
        new Application(new Library(bookList), printStream).start();
    }
}
