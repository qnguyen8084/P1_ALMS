

package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DBLoanManagerTest {

    @Mock
    DBLoanManager dbLoanManager;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testBorrowBook() {
        int memberId = 123;
        int bookId = 456;
        doNothing().when(dbLoanManager).borrowBook(memberId, bookId);
        dbLoanManager.borrowBook(memberId, bookId);
        verify(dbLoanManager, times(1)).borrowBook(memberId, bookId);
    }

    @Test
    void testReturnBook() {
        int memberId = 123;
        int bookId = 456;
        doNothing().when(dbLoanManager).returnBook(memberId, bookId);
        dbLoanManager.returnBook(memberId, bookId);
        verify(dbLoanManager, times(1)).returnBook(memberId, bookId);
    }

    @Test
    void testListLoans() {
        doNothing().when(dbLoanManager).listLoans();
        dbLoanManager.listLoans();
        verify(dbLoanManager, times(1)).listLoans();
    }

    @Test
    void testIsBookAvailable() {
        int bookId = 456;
        when(dbLoanManager.isBookAvailable(bookId)).thenReturn(true);
        boolean result = dbLoanManager.isBookAvailable(bookId);
        assertTrue(result);
        verify(dbLoanManager, times(1)).isBookAvailable(bookId);
    }

    @Test
    void testSetBookAvailability() {
        int availability = 1;
        int bookId = 456;
        doNothing().when(dbLoanManager).setBookAvailability(availability, bookId);
        dbLoanManager.setBookAvailability(availability, bookId);
        verify(dbLoanManager, times(1)).setBookAvailability(availability, bookId);
    }

    @Test
    void testAddLoan() {
        int memberId = 123;
        int bookId = 456;
        doNothing().when(dbLoanManager).addLoan(bookId, memberId);
        dbLoanManager.addLoan(bookId, memberId);
        verify(dbLoanManager, times(1)).addLoan(bookId, memberId);
    }

    @Test
    void testRemoveLoan() {
        int memberId = 123;
        int bookId = 456;
        doNothing().when(dbLoanManager).removeLoan(bookId, memberId);
        dbLoanManager.removeLoan(bookId, memberId);
        verify(dbLoanManager, times(1)).removeLoan(bookId, memberId);
    }
}