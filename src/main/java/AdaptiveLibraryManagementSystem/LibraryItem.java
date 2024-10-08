/*
 * Quy Nguyen
 * Dhruv Shah
 * CS635
 * Adaptive Library Management System
 * LibraryItem.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

// Abstract class representing a library item.
// It contains common attributes and methods for different types of items such as books and magazines.
public abstract class LibraryItem {
    private final String title; // Title of the library item (book, magazine, etc.)
    private final String itemType; // Type of the item (e.g., book, magazine)
    protected static final String BOOK = "book"; // Constant for the item type "book"
    protected static final String MAGAZINE = "magazine"; // Constant for the item type "magazine"

    private boolean available = true; // Availability status of the item (true = available, false = unavailable)

    // Constructor for a library item with the item type and title. Default availability is true.
    public LibraryItem(String itemType, String title) {
        this.itemType = itemType;
        this.title = title;
    }

    // Constructor for a library item with the item type, title, and availability status.
    public LibraryItem(String itemType, String title, boolean isAvailable) {
        this.itemType = itemType;
        this.title = title;
        this.available = isAvailable;
    }

    // Getter for the title of the library item.
    public String getTitle() {
        return title;
    }

    // Getter to check if the item is available.
    public boolean isAvailable() {
        return available;
    }

    // Setter to update the availability of the item.
    public void setAvailable(boolean isAvailable) {
        this.available = isAvailable;
    }
}

// Interface defining common behaviors for items in the library.
interface LibraryItemInterface {
    int getId(); // Method to get the ID of the library item.
    String getCreator(); // Method to get the creator (e.g., author for books, journalist for magazines) of the item.
}

