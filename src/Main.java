import java.io.PrintStream;

public class Main {



    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        Library library = new Library(printStream);
        library.printGreeting();
        library.printAllLibraryBooks();
    }
}