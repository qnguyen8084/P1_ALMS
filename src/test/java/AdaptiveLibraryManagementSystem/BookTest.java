package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIdWithFullConstructors() {
        // create a Book instance using the full constructor
        Book testBook = new Book(123, "Test Title", "Test Author", true);

        // call getId() and check if it returns correct id
        int returnedId = testBook.getId();
        assertEquals(123, returnedId, "Returned id should be the same as the id used for object creation");
    }

    @Test
    void getTitleWithFullConstructors() {
        // create a Book instance using the full constructor
        Book testBook = new Book(123, "Test Title", "Test Author", true);

        assertEquals("Test Title", testBook.getTitle(), "Returned title should be the same as the id used for object creation");
    }

    @Test
    void getCreatorWithFullConstructors() {
        // create a Book instance using the full constructor
        Book testBook = new Book(123, "Test Title", "Test Author", true);

        assertEquals("Test Author", testBook.getCreator(), "Returned author should be the same as the id used for object creation");
    }

    @Test
    void getIdWithTwoParamConstructors() {
        // create a Book instance using the basic constructor
        Book testBook = new Book("Test Title", "Test Author");

        // call getId() and check if it returns 0 (default int value in Java)
        int returnedId = testBook.getId();
        assertEquals(0, returnedId, "Returned id should be 0 as it was not set during object creation");
    }

    @Test
    void getTitleWithTwoParamConstructors() {
        // create a Book instance using the basic constructor
        Book testBook = new Book("Test Title", "Test Author");


        assertEquals("Test Title", testBook.getTitle(), "Returned title should be the same as the id used for object creation");
    }

    @Test
    void getCreatorWithTwoParamConstructors() {
        // create a Book instance using the basic constructor
        Book testBook = new Book("Test Title", "Test Author");

        assertEquals("Test Author", testBook.getCreator(), "Returned author should be the same as the id used for object creation");
    }
}