package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryItemTest {

    @Test
    void testSetAvailableWhenCurrentlyAvailable() {
        LibraryItem magazine = new Magazine("Times", "Adam Smith");
        assertTrue(magazine.isAvailable(), "Check initial availability");

        magazine.setAvailable(false);
        assertFalse(magazine.isAvailable(), "Check availability after setter");
    }

    @Test
    void testSetAvailableWhenCurrentlyUnavailable() {
        LibraryItem magazine = new Magazine("Times", "Adam Smith");
        magazine.setAvailable(false);
        assertFalse(magazine.isAvailable(), "Check initial availability");

        magazine.setAvailable(true);
        assertTrue(magazine.isAvailable(), "Check availability after setter");
    }

    @Test
    void testGetTitleWhenAvailable() {
        LibraryItem magazine = new Magazine("Times", "Adam Smith");
        assertEquals("Times", magazine.getTitle(), "Check the title of the available item");
    }

    @Test
    void testGetTitleWhenUnavailable() {
        LibraryItem magazine = new Magazine("Times", "Adam Smith");
        assertEquals("Times", magazine.getTitle(), "Check the title of the unavailable item");
    }
}
