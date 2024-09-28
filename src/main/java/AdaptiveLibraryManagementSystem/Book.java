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
public class Book {
    private int bookId;
    private final String title;
    private final String author;
    private boolean isAvailable = true;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(int bookId, String title, String author, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public int getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
