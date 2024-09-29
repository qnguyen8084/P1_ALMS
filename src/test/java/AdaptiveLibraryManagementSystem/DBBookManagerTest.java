/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * DBBookManagerTest.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DBBookManagerTest {
    private DBBookOperations bookOperations;
    private DBBookManager bookmanager;

    @BeforeEach
    void setUp() {
        bookOperations = mock(DBBookOperations.class);
        bookmanager = new DBBookManager();
    }

    @Test
    void AddBookTest() {
        DBBookManager manager = new DBBookManager();
        manager.addBook("Title", "Author");

        // Verify the book added in the database
    }

    @Test
    void RemoveBookTest() {
        DBBookManager manager = new DBBookManager();
        manager.removeBook(1); // Assuming book id with '1' is already exists in database
        // Verify the book removed from the database
    }

    @Test
    void ListBookTest() {
        DBBookManager manager = new DBBookManager();
        manager.listBooks();
        // Verify all the books listed from the database
    }
}
