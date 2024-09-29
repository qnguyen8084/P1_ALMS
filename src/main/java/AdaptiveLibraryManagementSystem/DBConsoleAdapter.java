/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * DBConsoleAdapter.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;

public class DBConsoleAdapter implements AdapterOperations {
    DBManager db = new DBManager();
    BookManager bookManager = new BookManager();
    UserManager userManager = new UserManager();
    LoanManager loanManager = new LoanManager();

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
        userManager.addMember(name);
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
    public void search(String searchField, String searchString) {
    }

    @Override
    public void listHistory() {
        DBHistoryLogger.listHistory();
    }

}
