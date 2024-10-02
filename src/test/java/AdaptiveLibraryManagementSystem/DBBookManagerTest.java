package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DBBookManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        DBBookManager dbBookManager = new DBBookManager();
        Book testBook = new Book("Example Book", "Example Author");
        dbBookManager.add(testBook);
        // additional assertions or verifications here
    }

    @Test
    void remove() {
        DBBookManager dbBookManager = new DBBookManager();
        Book testBook = new Book("Example Book", "Example Author");
        dbBookManager.add(testBook);
        dbBookManager.remove(1);
        // additional assertions or verifications here
    }

    @Test
    void search() {
        DBBookManager dbBookManager = new DBBookManager();
        Book testBook = new Book("Example Book", "Example Author");
        dbBookManager.add(testBook);
        dbBookManager.search("Example Book");
        // additional assertions or verifications here
    }

    @Test
    void list() {
        DBBookManager dbBookManager = new DBBookManager();
        Book testBook = new Book("Example Book", "Example Author");
        dbBookManager.add(testBook);
        dbBookManager.list();
        // additional assertions or verifications here
    }
}