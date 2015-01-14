import java.io.PrintStream;
import java.util.List;

/**
 * Created by ialsanea on 1/13/15.
 */
public class Library {

    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void printAllLibraryBooks(PrintStream printStream) {
        for (Book book : bookList) {
            printStream.println(book.toString());
        }
    }
}
