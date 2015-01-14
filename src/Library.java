import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by ialsanea on 1/13/15.
 */
public class Library {

    private ArrayList<Book> bookList;

    public Library(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Book> getAllBooks() {
//        System.out.println(bookList);
        return bookList;
    }

    public void listAllLibraryBooks() {
    }
}
