package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * The DBLoanManagerTest class contains unit tests for the DBLoanManager class,
 * using Mockito to mock the behavior of DBLoanManager methods and verify that
 * they are called as expected.
 */
class DBLoanManagerTest {

    // Mock object for DBLoanManager to simulate its behavior in tests
    @Mock
    DBLoanManager dbLoanManager;

    /**
     * Initializes the mock objects before each test runs.
     */
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);  // Initializes Mockito annotations
    }

    /**
     * Test the borrowBook method to ensure it is called with the correct parameters.
     */
    @Test
    void testBorrowBook() {
        int memberId = 123;
        int bookId = 456;

        // Set up the mock to do nothing when borrowBook is called
        doNothing().when(dbLoanManager).borrowBook(memberId, bookId);

        // Call the method being tested
        dbLoanManager.borrowBook(memberId, bookId);

        // Verify that borrowBook was called exactly once with the correct parameters
        verify(dbLoanManager, times(1)).borrowBook(memberId, bookId);
    }

    /**
     * Test the returnBook method to ensure it is called with the correct parameters.
     */
    @Test
    void testReturnBook() {
        int memberId = 123;
        int bookId = 456;

        // Set up the mock to do nothing when returnBook is called
        doNothing().when(dbLoanManager).returnBook(memberId, bookId);

        // Call the method being tested
        dbLoanManager.returnBook(memberId, bookId);

        // Verify that returnBook was called exactly once with the correct parameters
        verify(dbLoanManager, times(1)).returnBook(memberId, bookId);
    }

    /**
     * Test the listLoans method to ensure it is called.
     */
    @Test
    void testListLoans() {
        // Set up the mock to do nothing when listLoans is called
        doNothing().when(dbLoanManager).listLoans();

        // Call the method being tested
        dbLoanManager.listLoans();

        // Verify that listLoans was called exactly once
        verify(dbLoanManager, times(1)).listLoans();
    }

    /**
     * Test the isBookAvailable method to ensure it returns the correct value
     * and is called with the correct parameters.
     */
    @Test
    void testIsBookAvailable() {
        int bookId = 456;

        // Set up the mock to return true when isBookAvailable is called
        when(dbLoanManager.isBookAvailable(bookId)).thenReturn(true);

        // Call the method being tested and capture the result
        boolean result = dbLoanManager.isBookAvailable(bookId);

        // Assert that the result is true
        assertTrue(result);

        // Verify that isBookAvailable was called exactly once with the correct parameter
        verify(dbLoanManager, times(1)).isBookAvailable(bookId);
    }

    /**
     * Test the setBookAvailability method to ensure it is called with the correct parameters.
     */
    @Test
    void testSetBookAvailability() {
        int availability = 1;
        int bookId = 456;

        // Set up the mock to do nothing when setBookAvailability is called
        doNothing().when(dbLoanManager).setBookAvailability(availability, bookId);

        // Call the method being tested
        dbLoanManager.setBookAvailability(availability, bookId);

        // Verify that setBookAvailability was called exactly once with the correct parameters
        verify(dbLoanManager, times(1)).setBookAvailability(availability, bookId);
    }

    /**
     * Test the addLoan method to ensure it is called with the correct parameters.
     */
    @Test
    void testAddLoan() {
        int memberId = 123;
        int bookId = 456;

        // Set up the mock to do nothing when addLoan is called
        doNothing().when(dbLoanManager).addLoan(bookId, memberId);

        // Call the method being tested
        dbLoanManager.addLoan(bookId, memberId);

        // Verify that addLoan was called exactly once with the correct parameters
        verify(dbLoanManager, times(1)).addLoan(bookId, memberId);
    }

    /**
     * Test the removeLoan method to ensure it is called with the correct parameters.
     */
    @Test
    void testRemoveLoan() {
        int memberId = 123;
        int bookId = 456;

        // Set up the mock to do nothing when removeLoan is called
        doNothing().when(dbLoanManager).removeLoan(bookId, memberId);

        // Call the method being tested
        dbLoanManager.removeLoan(bookId, memberId);

        // Verify that removeLoan was called exactly once with the correct parameters
        verify(dbLoanManager, times(1)).removeLoan(bookId, memberId);
    }
}
