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
        return formattedTitle() + " | " + formattedAuthor() + " | " + year;
    }

    private String formattedAuthor() {
//        return String.format("%1$"+length+ "s", string);
        return String.format( "%-1$10s", author);
//        return author.substring(0, Math.min(author.length(), 10));
    }

    private String formattedTitle() {
        return title.substring(0, Math.min(title.length(), 20));
    }
}
