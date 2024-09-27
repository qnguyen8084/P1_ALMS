/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * DBConsoleAdapter.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;

public class DBConsoleAdapter implements _Transactions{
    DBManager db = new DBManager();

    @Override
    public void addBook(Book book) {
        String title = book.getTitle();
        String author = book.getAuthor();
        db.addBook(title, author);
    }

    @Override
    public void removeBook(int bookId) {
        db.removeBook(bookId);
    }

    @Override
    public void listBooks() {
        db.listBooks();
    }

    @Override
    public void addMember(Member member) {
        String name = member.getName();
        db.addMember(name);
    }

    @Override
    public void removeMember(int memberId) {
        db.removeMember(memberId);
    }

    @Override
    public void listMembers() {
        db.listMembers();
    }

    @Override
    public void borrowBook(int memberId, int bookId) {
        db.borrowBook(memberId, bookId);
    }

    @Override
    public void returnBook(int memberId, int bookId) {
        db.returnBook(memberId, bookId);
    }

    @Override
    public void listLoans() {
        db.listLoans();
    }

    @Override
    public void search(String searchField, String searchString) {


    }

}
