package AdaptiveLibraryManagementSystem;

// Class representing a book in the library.
public class Book extends LibraryItem implements LibraryItemInterface {
    private int bookId; // ID of the book
    private final String author; // Author of the book

    // Constructor for a book with title and author. The book is available by default.
    public Book(String title, String author) {
        super(BOOK, title);
        this.author = author;
    }

    // Constructor for a book with ID, title, author, and availability status.
    public Book(int bookId, String title, String author, boolean isAvailable) {
        super(BOOK, title, isAvailable);
        this.bookId = bookId;
        this.author = author;
    }

    // Implementation of the getId() method from the LibraryItemInterface.
    @Override
    public int getId() {
        return bookId;
    }

    // Implementation of the getCreator() method from the LibraryItemInterface.
    @Override
    public String getCreator() {
        return author;
    }
}
