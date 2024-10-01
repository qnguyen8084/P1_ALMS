/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * DBConsoleAdapter.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

public class DBConsoleAdapter implements AdapterOperations, BookAdapterOperations,
        UserAdapterOperations, LoanAdapterOperations {
    DBManager dbManager = new DBManager();
    DBBookManager bookManager = new DBBookManager();
    DBUserManager userManager = new DBUserManager();
    DBLoanManager loanManager = new DBLoanManager();

    @Override
    public void addBook(Book book) {
        String title = book.getTitle();
        String author = book.getCreator();
        bookManager.addBook(title, author);
    }

    @Override
    public void removeBook(int bookId) {
        bookManager.removeBook(bookId);
    }

    @Override
    public void listBooks() {
        bookManager.listBooks();
    }

    @Override
    public void addMember(Member member) {
        String name = member.getName();
    }

    @Override
    public void removeMember(int memberId) {
        userManager.removeMember(memberId);
    }

    @Override
    public void listMembers() {
        userManager.listMembers();
    }

    @Override
    public void borrowBook(int memberId, int bookId) {
        loanManager.borrowBook(memberId, bookId);
    }

    @Override
    public void returnBook(int memberId, int bookId) {
        loanManager.returnBook(memberId, bookId);
    }

    @Override
    public void listLoans() {
        loanManager.listLoans();
    }

    @Override
    public void search(String table, String searchField, String searchString) {
        dbManager.search(table, searchField, searchString);
    }

    @Override
    public void listHistory() {
        DBHistoryLogger.listHistory();
    }

}
