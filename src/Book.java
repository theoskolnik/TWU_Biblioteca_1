import java.io.PrintStream;

/**
 * Created by ialsanea on 1/13/15.
 */
public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {

        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String returnBookDetails() {
        String formatString = "%-20.20s | %-10s | %-4s";
        return String.format(formatString, title, author, year);
    }
}
