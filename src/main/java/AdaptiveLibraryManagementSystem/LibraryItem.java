/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * Book.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;

// This is the class declaration for a Book class it has two constructors.
// Constructor with two parameters is used when adding books to books table in the database
// Constructor with four parameters is intended to be used when =

public abstract class LibraryItem {
    private final String title;
    private final String itemType;
    protected static final String BOOK = "book";
    protected static final String MAGAZINE = "magazine";

    private boolean available = true;

    public LibraryItem(String itemType, String title) {
        this.itemType = itemType;
        this.title = title;
    }

    public LibraryItem(String itemType, String title, boolean isAvailable) {
        this.itemType = itemType;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean isAvailable) {
        this.available = isAvailable;
    }

}

interface LibraryItemInterface {
    int getId();
    String getCreator();
}


class Book extends LibraryItem implements LibraryItemInterface{
    private int bookId;
    private final String author;

    public Book(String title, String author) {
        super(BOOK, title);
        this.author = author;
    }

    public Book(int bookId, String title, String author, boolean isAvailable) {
        super(BOOK, title, isAvailable);
        this.bookId = bookId;
        this.author = author;
    }

    @Override
    public int getId() {
        return bookId;
    }

    @Override
    public String getCreator() {
        return author;
    }

}

class Magazine extends LibraryItem implements LibraryItemInterface{
    private int magazineId;
    private final String journalist;

    public Magazine(String title, String journalist) {
        super(MAGAZINE, title);
        this.journalist = journalist;
    }

    public Magazine(int magazineId, String title, String journalist, boolean isAvailable) {
        super(MAGAZINE, title, isAvailable);
        this.magazineId = magazineId;
        this.journalist = journalist;
    }

    @Override
    public int getId() {
        return magazineId;
    }

    @Override
    public String getCreator() {
        return journalist;
    }

}